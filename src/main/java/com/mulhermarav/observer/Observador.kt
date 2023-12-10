package com.mulhermarav.observer

interface Observador {
    fun mudancaQuantidade(acao : String, qtd : Int)
}