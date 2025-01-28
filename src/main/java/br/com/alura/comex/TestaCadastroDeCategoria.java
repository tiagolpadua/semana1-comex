package br.com.alura.comex;

import br.com.alura.comex.models.Categoria;
import br.com.alura.comex.daos.CategoriaDao;

public class TestaCadastroDeCategoria {

    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Automotiva");

        CategoriaDao dao = new CategoriaDao();
        dao.cadastra(categoria);

        System.out.println("Categoria cadastrada com sucesso!");

        Categoria categoriaConsultada = dao.pesquisaPeloId(categoria.getId());
        System.out.println("ID: " + categoriaConsultada.getId());
        System.out.println("NOME: " + categoriaConsultada.getNome());
    }
}
