package br.com.alura.comex.daos;

import br.com.alura.comex.exceptions.EntidadeNaoEncontradaException;
import br.com.alura.comex.models.Produto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class ProdutoDaoTest {

    @Test
    void listaTodos() {
        ProdutoDao produtoDao = new ProdutoDao();
        List<Produto> produtos = produtoDao.listaTodos();
        assertFalse(produtos.isEmpty());
    }

    @Test
    void consultaProdutoInexistente() {
        var produtoDao = new ProdutoDao();

        var exception = assertThrows(
                EntidadeNaoEncontradaException.class,
                () -> produtoDao.consulta(9999),
                "Expected consulta(9999) to throw, but it didn't"
        );

        assertTrue(exception.getMessage().contains("não encontrado"));
    }
}