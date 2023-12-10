package com.mulhermarav.nullobject

class CarrinhoUser(
    private val valor: Double,
    private val tamanho: Int,
    private val nomeUsuario: String
) : Carrinho {
    override fun getValor(): Double = this.valor

    override fun getTamanho(): Int = this.tamanho

    override fun getNomeUsuario(): String = this.nomeUsuario
}