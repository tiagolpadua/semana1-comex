package br.com.alura.comex.daos;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.alura.comex.models.Cliente;

class ClienteDaoTests {

  @Test
  void testListaTodos() {
    var clienteDao = new ClienteDao();
    var clientes = clienteDao.listaTodos();
    assertTrue(clientes.size() > 0, "Deve ter clientes");
  }

  @Test
  void testCadastra() {
    var novoCliente = new Cliente();
    novoCliente.setNome("Grupo A Volta dos que não foram");
    novoCliente.setEmail("grupoavltadosquenaoforam@gmail.com");
    novoCliente.setTelefone("(61) 99999-9999");
    novoCliente.setCpf("666.777.888-99");
    novoCliente.setLogradouro("Rua 1");
    novoCliente.setBairro("Bairro 1");
    novoCliente.setCidade("Brasília");
    novoCliente.setEstado("DF");
    novoCliente.setCep("72000-000");

    var clienteDao = new ClienteDao();
    clienteDao.cadastra(novoCliente);

    assertNotNull(novoCliente.getId(), "Deve ter o id definido");
  }
}
