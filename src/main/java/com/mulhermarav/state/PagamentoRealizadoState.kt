package com.mulhermarav.state

class PagamentoRealizadoState(
    private val vendingMachine: VendingMachine
) : VendingMachineState {

    override fun selecionarProduto() {
        println("Produto selecionado. Aguarde a entrega.")
        vendingMachine.alterarEstado(ProdutoEntregueState(vendingMachine))
    }

    override fun inserirMoeda() {
        println("Você já inseriu a moeda.")
    }

    override fun dispensarProduto() {
        println("Por favor, selecione o produto primeiro.")
    }
}