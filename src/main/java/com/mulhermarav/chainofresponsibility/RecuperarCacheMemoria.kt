package com.mulhermarav.chainofresponsibility

class RecuperarCacheMemoria(
    proximo: RecuperadorArquivo?
) : RecuperadorArquivo(proximo) {

    private var cache : MutableMap<String, Arquivo> = mutableMapOf()

    override fun recuperaArquivo(nome: String): Arquivo? {
        return cache[nome] ?: run { null }
    }

    override fun chamarProximo(nome : String) : Arquivo {
        val arquivo = super.chamarProximo(nome)

        cache[nome] = arquivo

        return arquivo
    }

    fun addArquivoNoCache(arquivo: Arquivo) {
        cache[arquivo.nome] = arquivo
    }
}