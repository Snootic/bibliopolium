package com.booker.application;

import java.sql.SQLException;
import java.util.Scanner;

import com.booker.application.dto.LivroDTO;
import com.booker.domain.LivroService;
import com.booker.infrastructure.migrations.CreateTableProduto;

public class Menu {
    public void mainMenu() throws SQLException, Exception{
        CreateTableProduto createTableProduto = new CreateTableProduto();
        createTableProduto.createProdutos();

        
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        String nome, autor, isbn, editora, genero;
        int ano;

        LivroService service = new LivroService();

        System.out.print("Digite o nome do livro: ");
        nome = sc.nextLine();

        System.out.print("Digite o autor do livro: ");
        autor = sc.nextLine();

        System.out.print("Digite o isbn do livro: ");
        isbn = sc.nextLine();

        System.out.print("Digite o editora do livro: ");
        editora = sc.nextLine();

        System.out.print("Digite o genero do livro: ");
        genero = sc.nextLine();

        System.out.print("Digite o ano do livro: ");
        ano = scInt.nextInt();

        service.criarLivro(new LivroDTO(nome, autor, isbn, editora, genero, String.valueOf(ano)));
        LivroDTO livro = service.resgatarLivro(isbn);
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getISBN());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Ano de lançamento: " + livro.getAno());

        sc.close();
        scInt.close();

    }
}
