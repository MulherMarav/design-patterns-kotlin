package com.mulhermarav.state

class ProdutoEntregueState(
    private val vendingMachine: VendingMachine
) : VendingMachineState {
    override fun selecionarProduto() {
        println("Por favor, retire o produto anterior antes de selecionar outro.")
    }

    override fun inserirMoeda() {
        println("Por favor, retire o produto antes de inserir mais moedas.")
    }

    override fun dispensarProduto() {
        println("Produto entregue. Obrigado por comprar conosco!")
        vendingMachine.alterarEstado(PagamentoPendenteState(vendingMachine))
    }
}