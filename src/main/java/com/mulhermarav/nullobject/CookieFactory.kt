package com.mulhermarav.nullobject

class CookieFactory {
    fun criarCarrinho(any : Any?) : Carrinho {
        val user: User? = any as? User

        return user?.let { (valor, tamanho, nomeUsuario) ->
            CarrinhoUser(valor, tamanho, nomeUsuario)
        } ?: CarrinhoNulo()
    }
}