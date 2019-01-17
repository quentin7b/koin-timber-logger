package com.github.quentin7b.kointimber

import org.koin.log.Logger
import timber.log.Timber

/**
 * Simple Koin logger using Timber
 * @param showDebug Boolean specifies if we should log showDebug messages, default is true
 * @param showErr Boolean specifies if we should log error messages, default is true
 * @param showInfo Boolean specifies if we should log showInfo messages, default is true
 * @param tag String nullable specifies the tag to use with Timber for the logs, if null, no tag is set
 */
class TimberLogger(
    private val showDebug: Boolean = true,
    private val showErr: Boolean = true,
    private val showInfo: Boolean = true,
    tag: String? = null
) : Logger {

    /**
     * Tree used to print the messages, initialized by the construction
     */
    private val tree: Timber.Tree = if (tag === null) Timber.asTree() else Timber.tag(tag)

    /**
     * Deprecated
     * One parameter constructor. Every log (showDebug, showErr, showInfo) will be affected.
     * We recommend using <pre>EmptyLogger</pre>
     *
     * @param shouldLog Boolean specifies if we should log or not.
     * @see org.koin.log.EmptyLogger
     */
    @Deprecated(
        message = "This constructor is deprecated, use EmptyLogger() instead",
        replaceWith = ReplaceWith(
            expression = "EmptyLogger()",
            imports = ["org.koin.log.EmptyLogger"]
        ),
        level = DeprecationLevel.WARNING
    )
    constructor(shouldLog: Boolean) : this(shouldLog, shouldLog, shouldLog)

    override fun debug(msg: String) {
        if (showDebug) {
            tree.d(msg)
        }
    }

    override fun err(msg: String) {
        if (showErr) {
            tree.e(msg)
        }
    }

    override fun info(msg: String) {
        if (showInfo) {
            tree.i(msg)
        }
    }
}