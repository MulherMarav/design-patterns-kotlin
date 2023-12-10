package com.mulhermarav.strategy

class ContaEstacionamento(
    val calculo: CalculoValor,
    val veiculo: Veiculo,
    val inicio: Long,
    val fim: Long
) {
    fun valorConta(): Double {
        return calculo.calcular(fim-inicio, veiculo)
    }
}