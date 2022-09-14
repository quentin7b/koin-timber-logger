package com.github.quentin7b.kointimber

import android.app.Application
import io.insert-koin.android.ext.koin.androidContext
import io.insert-koin.core.context.startKoin
import io.insert-koin.dsl.module
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