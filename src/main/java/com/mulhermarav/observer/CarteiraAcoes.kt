package com.mulhermarav.observer

class CarteiraAcoes {
    private var acoes : MutableMap<String, Int> = hashMapOf()
    private var observadores : MutableList<Observador> = mutableListOf()

    fun adicionaAcoes(acao : String, quantidade : Int) {
        var qtd = quantidade

        acoes[acao]?.let { valor ->
            qtd += valor
        }

        acoes[acao] = qtd

        notificar(acao, qtd)
    }

    private fun notificar(acao: String, qtd: Int) {
        observadores.forEach{ observador ->
            observador.mudancaQuantidade(acao, qtd)
        }
    }

    fun addObservador(observador: Observador) {
        observadores.add(observador)
    }
}