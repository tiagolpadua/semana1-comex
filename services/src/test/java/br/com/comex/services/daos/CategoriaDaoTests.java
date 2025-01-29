package br.com.comex.services.daos;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.comex.core.exceptions.EntidadeNaoEncontradaException;
import br.com.comex.services.models.Categoria;

class CategoriaDaoTests {
  @Test
  void testListaTodos() {
    var categoriaDao = new CategoriaDao();
    var categorias = categoriaDao.listaTodos();
    assertTrue(categorias.size() > 0, "Deve ter categorias");
  }

  @Test
  void testCadastra() {
    var categoria = new Categoria();
    categoria.setNome("Automotiva");

    var dao = new CategoriaDao();
    dao.cadastra(categoria);

    assertNotNull(categoria.getId(), "Deve ter o id definido");
  }

  @Test
  void testBuscaPorId() {
    var dao = new CategoriaDao();
    var thrown = assertThrows(
        EntidadeNaoEncontradaException.class,
        () -> dao.buscaPorId(999),
        "Deve lançar exceção quando não encontrar a categoria");
    assertTrue(thrown.getMessage().contains("encontrada"));
  }
}
