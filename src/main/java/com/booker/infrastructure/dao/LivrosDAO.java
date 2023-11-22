package com.booker.infrastructure.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.booker.ConnectionSQL;
import com.booker.infrastructure.entities.Livro;

public class LivrosDAO{
    public void criar() throws SQLException, Exception{
        ConnectionSQL connectionSQL = new ConnectionSQL();
        Connection conn = connectionSQL.connect();

        PreparedStatement preparedStatement;

        String query = "INSERT INTO livros(titulo, autor, isbn, editora, genero, ano) values (?, ?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, "Titulo do Livro");
        preparedStatement.setString(2, "Autor do Livro");
        preparedStatement.setString(3, "ISBN do Livro");
        preparedStatement.setString(4, "Editora do Livro");
        preparedStatement.setString(5, "Genero do Livro");
        preparedStatement.setString(6, "Ano do Livro");

        preparedStatement.execute();

        System.out.println("Produto foi criado.");
    }

    public Livro resgatar(String isbnInput) throws SQLException, Exception{
        ConnectionSQL connectionSQL = new ConnectionSQL();
        Connection conn = connectionSQL.connect();

        PreparedStatement preparedStatement;

        String query = "select * from livros where isbn='" + isbnInput + "'";

        preparedStatement = conn.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            String titulo = rs.getString("titulo");
            String autor = rs.getString("autor");
            String isbn = rs.getString("isbn");
            String editora = rs.getString("editora");
            String genero = rs.getString("genero");
            String ano = rs.getString("ano");

            Livro livro = new Livro(titulo, autor, isbn, editora, genero, ano);

            return livro;
        }

        return null;
    }
}
