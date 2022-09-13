package com.github.quentin7b.kointimber

import io.insert-koin.core.logger.Level
import io.insert-koin.core.logger.Logger
import io.insert-koin.core.logger.MESSAGE
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
    private val showInfo: Boolean = true,
    private val showErr: Boolean = true,
    tag: String? = null
) : Logger() {

    /**
     * Tree used to print the messages, initialized by the construction
     */
    private val tree: Timber.Tree = if (tag === null) Timber.asTree() else Timber.tag(tag)

    private fun showDebug(msg: String) {
        if (showDebug) {
            tree.d(msg)
        }
    }

    private fun showErr(msg: String) {
        if (showErr) {
            tree.e(msg)
        }
    }

    private fun showInfo(msg: String) {
        if (showInfo) {
            tree.i(msg)
        }
    }

    override fun log(level: Level, msg: MESSAGE) {
        when (level) {
            Level.INFO -> showInfo(msg)
            Level.DEBUG -> showDebug(msg)
            Level.ERROR -> showErr(msg)
            Level.NONE -> {
                // Show nothing
            }
        }
    }
}