package com.booker;

import com.booker.domain.LivroService;
import com.booker.infrastructure.entities.Livro;
import com.booker.infrastructure.migrations.CreateTableProduto;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        CreateTableProduto createTableProduto = new CreateTableProduto();
        createTableProduto.createProdutos();

        LivroService service = new LivroService();
        service.criarLivro();
        Livro livro = service.resgatarLivro("ISBN do Livro");
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getISBN());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Ano de lançamento: " + livro.getAno());

    }
}
