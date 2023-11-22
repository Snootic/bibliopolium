package com.booker;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.booker.migrations.CreateTableProduto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        CreateTableProduto createTableProduto = new CreateTableProduto();
        createTableProduto.createProdutos();

        ConnectionSQL connectionSQL = new ConnectionSQL();
        Connection conn = connectionSQL.connect();

        PreparedStatement preparedStatement;

        String query = "INSERT INTO livros(titulo, autor, isbn, editora, genero, ano) values (?, ?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(0, "Titulo do Livro");
        preparedStatement.setString(1, "Autor do Livro");
        preparedStatement.setString(2, "ISBN do Livro");
        preparedStatement.setString(3, "Editora do Livro");
        preparedStatement.setString(4, "Genero do Livro");
        preparedStatement.setString(5, "Ano do Livro");

        preparedStatement.execute();

        System.out.println("Produto foi criado.");


    }
}
