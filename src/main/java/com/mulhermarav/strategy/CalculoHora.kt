package com.mulhermarav.strategy

import kotlin.math.ceil

class CalculoHora(
    val valorHora: Double
) : CalculoValor {
    override fun calcular(periodo: Long, veiculo: Veiculo): Double {
        return valorHora * ceil(periodo / Tempo.HORA.milli)
    }
}