package com.innovorder.plugins

import com.innovorder.model.PostRandomRequest
import com.innovorder.model.PostRandomResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {

        get("/") {
            call.respondText("Hello World!")
        }

        post("/random") {
            val response = call.receive<PostRandomRequest>()
            val random = response.names.random()
            val result = PostRandomResponse(random = random)
            call.respond(message = result, status = HttpStatusCode.Created)
        }

    }

}
