package com.mulhermarav.state

class VendingMachine {
    private var estado: VendingMachineState = PagamentoPendenteState(this)

    fun selecionarProduto() {
        estado.selecionarProduto()
    }

    fun inserirMoeda() {
        estado.inserirMoeda()
    }

    fun dispensarProduto() {
        estado.dispensarProduto()
    }

    fun alterarEstado(novoEstado: VendingMachineState) {
        this.estado = novoEstado
    }
}