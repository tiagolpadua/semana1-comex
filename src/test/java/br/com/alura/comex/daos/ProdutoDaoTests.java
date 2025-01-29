package br.com.alura.comex.daos;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.alura.comex.models.Categoria;
import br.com.alura.comex.models.Produto;

class ProdutoDaoTests {

  @Test
  void listaTodos() {
    var produtoDao = new ProdutoDao();
    var produtos = produtoDao.listaTodos();
    assertTrue(produtos.size() > 0, "Deve ter produtos");
  }

  @Test
  void testCadastra() {
    var produto = new Produto();
    produto.setNome("Cadeira Gamer");
    produto.setDescricao("Cadeira Gamer com almofadas e ajuste de altura");
    produto.setPreco(1200.0);

    var categoria = new Categoria();
    categoria.setId(2L);

    produto.adicionaCategoria(categoria);

    var produtoDao = new ProdutoDao();
    produtoDao.cadastra(produto);

    assertNotNull(produto.getId(), "Deve ter o id definido");
  }
}
