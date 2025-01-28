package br.com.alura.comex.daos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProdutoDaoTests {

  @Test
  void listaTodos() {
    ProdutoDao produtoDao = new ProdutoDao();
    var produtos = produtoDao.listaTodos();
    assertEquals(8, produtos.size(), "Deve ter 8 produtos");
  }
}
