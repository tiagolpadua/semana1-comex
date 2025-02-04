package br.com.alura.comex.daos;

import br.com.alura.comex.exceptions.EntidadeNaoEncontradaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoDaoTest {

    @Test
    void listaTodos() {
        var produtoDao = new ProdutoDao();
        var produtos = produtoDao.listaTodos();
        assertTrue(!produtos.isEmpty(), "Deve ter produtos");
    }

    @Test
    void consultaProdutoExistente() {
        var produtoDao = new ProdutoDao();
        var produto = produtoDao.consulta(1);
        assertNotNull(produto);
    }

    @Test
    void consultaProdutoInexistente() {
        var produtoDao = new ProdutoDao();

        var excecao = assertThrows(
                EntidadeNaoEncontradaException.class,
                () -> produtoDao.consulta(9999),
                "Esperava que produtoDao.consulta(99999) lançasse uma exceção, mas não lançou"
        );

        assertTrue(excecao.getMessage().contains("Produto não encontrado"));
    }
}