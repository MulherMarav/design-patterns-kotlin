package com.mulhermarav.nullobject

import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.request.receive
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import java.time.Instant
import java.time.temporal.ChronoUnit

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        embeddedServer(Netty, port = 8080) {

            routing {
                get("/") {

                    val request = call.receive<Any>()

                    val factory = CookieFactory()

                    val carrinho = factory.criarCarrinho(request)

                    call.respondText("User: ${carrinho.getNomeUsuario()} " +
                        "Valor: ${carrinho.getValor()} " +
                        "Qtd: ${carrinho.getTamanho()}")
                }
            }
        }.start(wait = true)
    }
}



