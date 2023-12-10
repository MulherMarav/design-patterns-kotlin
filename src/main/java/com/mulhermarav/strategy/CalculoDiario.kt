package com.mulhermarav.strategy

import kotlin.math.ceil

class CalculoDiaria(
    val valorDiaria: Double
) : CalculoValor {
    override fun calcular(periodo: Long, veiculo: Veiculo): Double {
        return valorDiaria * ceil(periodo / Tempo.DIA.milli)
    }
}