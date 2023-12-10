package com.mulhermarav.observer

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
        val carteiraAcoes = CarteiraAcoes()

        carteiraAcoes.addObservador(AcoesLogger())

        carteiraAcoes.adicionaAcoes("Ação 1", 3)
        carteiraAcoes.adicionaAcoes("Ação 1", 4)
    }
}



