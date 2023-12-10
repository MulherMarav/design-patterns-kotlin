package com.mulhermarav.strategy

import java.time.Instant
import java.time.temporal.ChronoUnit

object Main {
    @JvmStatic
    fun main(args: Array<String>) {

        val veiculo = Veiculo("ABC-1234", "Fusca", "Azul", "1970", 1.3)

        val contaDiaria: ContaEstacionamento =
            ContaEstacionamento(
                CalculoDiaria(10.0),
                veiculo,
                Instant.now().toEpochMilli(),
                Instant.now().plus(3, ChronoUnit.DAYS).toEpochMilli())

        println(contaDiaria.valorConta())

        val contaHora: ContaEstacionamento =
            ContaEstacionamento(
                CalculoHora(2.0),
                veiculo,
                Instant.now().toEpochMilli(),
                Instant.now().plus(4, ChronoUnit.HOURS).toEpochMilli())

        println(contaHora.valorConta())
    }
}



