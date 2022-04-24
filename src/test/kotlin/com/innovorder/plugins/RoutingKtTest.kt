package com.innovorder.plugins;

import com.innovorder.model.PostRandomRequest
import com.innovorder.model.PostRandomResponse
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class RoutingKtTest {

    @Test
    fun testPostRandomRequest() = testApplication {
        val client = createClient {
            install(ContentNegotiation) {
                json()
            }
        }

        val response = client.post("/random") {
            contentType(ContentType.Application.Json)
            setBody(PostRandomRequest(names = listOf("Renaud")))
        }

        assertEquals(PostRandomResponse(random = "Renaud"), response.body())
        assertEquals(HttpStatusCode.Created, response.status)
    }
}
