package com.github.quentin7b.kointimber

interface HelloService {
    fun sayHello(name: String = "world"): String
}