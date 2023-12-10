package com.mulhermarav.chainofresponsibility

import java.lang.RuntimeException

abstract class RecuperadorArquivo(
    val proximo : RecuperadorArquivo?
) {
    fun recuperar(nome: String): Arquivo {
        return recuperaArquivo(nome) ?:
        return chamarProximo(nome)
    }

     open fun chamarProximo(nome: String) : Arquivo {
         return proximo?.recuperar(nome) ?:
         throw RuntimeException("Não foi possível recuperar o arquivo")
    }

    protected abstract fun recuperaArquivo(nome: String):  Arquivo?
}