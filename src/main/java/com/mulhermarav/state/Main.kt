package com.mulhermarav.state

object Main {
    @JvmStatic
    fun main(args: Array<String>) {

        val vendingMachine = VendingMachine()

        vendingMachine.inserirMoeda()
        vendingMachine.selecionarProduto()
        vendingMachine.inserirMoeda()
        vendingMachine.dispensarProduto()
        vendingMachine.inserirMoeda()
        vendingMachine.dispensarProduto()
    }
}



