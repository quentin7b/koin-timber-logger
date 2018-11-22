package com.github.quentin7b.kointimber

class HelloImplementation : HelloService {
    override fun sayHello(name: String): String = "Hello $name"
}