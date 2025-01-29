package br.com.alura.comex.daos;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.alura.comex.models.Categoria;

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
}
