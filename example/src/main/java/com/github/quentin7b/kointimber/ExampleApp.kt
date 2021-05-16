package com.github.quentin7b.kointimber

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module
import timber.log.Timber

class ExampleApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        startKoin {
            TimberLogger(
                showDebug = true,
                showInfo = true,
                showErr = false,
                tag = "Koin"
            )
            androidContext(this@ExampleApp)
            modules(
                module {
                    single<HelloService> { HelloImplementation() }
                }
            )

        }
    }

}