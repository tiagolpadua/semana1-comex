package br.com.alura.comex;

import br.com.alura.comex.daos.CategoriaDao;
import br.com.alura.comex.models.Categoria;

import java.util.List;

public class TestaConsultaDeCategoria {

    public static void main(String[] args) {
        CategoriaDao categoriaDao = new CategoriaDao();
        List<Categoria> categorias = categoriaDao.listaTodos();

        for (Categoria categoria : categorias) {
            System.out.println("ID: " + categoria.getId());
            System.out.println("NOME: " + categoria.getNome());
            System.out.println("========================================");
            System.out.println();
        }

    }
}
