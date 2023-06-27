package com.renaudmathieu

import com.renaudmathieu.plugins.configureMonitoring
import com.renaudmathieu.plugins.configureRouting
import com.renaudmathieu.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.cio.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
