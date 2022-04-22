package com.innovorder

import io.ktor.server.application.*
import com.innovorder.plugins.*

fun main(args: Array<String>): Unit = io.ktor.server.cio.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureMonitoring()
    configureSerialization()
}
