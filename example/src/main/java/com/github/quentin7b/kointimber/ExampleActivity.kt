package com.github.quentin7b.kointimber

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import org.koin.android.ext.android.inject


class ExampleActivity : AppCompatActivity() {

    private val helloTextView by lazy {
        AppCompatTextView(baseContext).apply {
            layoutParams =
                ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
        }
    }
    private val helloService by inject<HelloService>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(helloTextView)
    }

    override fun onStart() {
        super.onStart()

        helloTextView.text = helloService.sayHello("You")
    }

}