package org.example

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun main() {
    val client = HttpClient(CIO){ // configure a client
        expectSuccess = true //response validation
        engine {
         //configure an engine
        }
    }
    val response: HttpResponse = client.get("http://Ktor.io")
    println(response.status)
    client.close()
}