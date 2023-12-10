package com.mulhermarav.observer

class AcoesLogger : Observador {
    override fun mudancaQuantidade(acao: String, qtd: Int) {
        println("Alterada a quantidade da ação $acao para $qtd")
    }
}