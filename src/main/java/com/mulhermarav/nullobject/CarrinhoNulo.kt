package com.mulhermarav.nullobject

class CarrinhoNulo : Carrinho {
    override fun getValor(): Double = 0.0

    override fun getTamanho(): Int = 0

    override fun getNomeUsuario(): String = "Not found"
}