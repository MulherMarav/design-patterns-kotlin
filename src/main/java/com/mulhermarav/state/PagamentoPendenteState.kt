package com.mulhermarav.state

class PagamentoPendenteState(
    private val vendingMachine: VendingMachine
) : VendingMachineState {
    override fun selecionarProduto() {
        println("Por favor, insira a moeda primeiro.")
    }

    override fun inserirMoeda() {
        println("Você inseriu a moeda.")
        vendingMachine.alterarEstado(PagamentoRealizadoState(vendingMachine))
    }

    override fun dispensarProduto() {
        println("Por favor, insira a moeda primeiro.")
    }
}