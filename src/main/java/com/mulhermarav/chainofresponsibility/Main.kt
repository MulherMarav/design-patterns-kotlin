package com.mulhermarav.chainofresponsibility

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
        val recupera = RecuperarCacheMemoria(null)

        recupera.addArquivoNoCache(Arquivo("teste", 35 ))
        recupera.addArquivoNoCache(Arquivo("teste 2", 150 ))
        recupera.addArquivoNoCache(Arquivo("teste 6", 250 ))

        val arquivo = recupera.recuperar("teste")

        println(arquivo.toString())
    }
}



