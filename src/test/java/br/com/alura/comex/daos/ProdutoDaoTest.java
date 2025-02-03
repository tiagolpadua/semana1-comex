package br.com.alura.comex.daos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoDaoTest {

    @Test
    void listaTodos() {
        var produtoDao = new ProdutoDao();
        var produtos = produtoDao.listaTodos();
        assertTrue(!produtos.isEmpty(), "Deve ter produtos");
    }
}