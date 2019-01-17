package com.github.quentin7b.kointimber

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.module
import timber.log.Timber

class ExampleApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        startKoin(
            androidContext = this,
            modules = listOf(
                module {
                    single { HelloImplementation() as HelloService }
                }
            ),
            logger = TimberLogger(
                showDebug = false,
                showInfo = true,
                tag = "Koin"
            )
        )
    }

}