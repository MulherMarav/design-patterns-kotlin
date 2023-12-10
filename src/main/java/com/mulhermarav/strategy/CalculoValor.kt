package com.mulhermarav.strategy

fun interface CalculoValor {
    fun calcular(periodo: Long, veiculo: Veiculo): Double
}