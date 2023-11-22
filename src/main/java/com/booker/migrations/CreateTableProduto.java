package com.booker.migrations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.booker.ConnectionSQL;

public class CreateTableProduto {

    public void createProdutos() throws Exception, SQLException{
        ConnectionSQL connectionSQL = new ConnectionSQL();
        Connection conn = connectionSQL.connect();
    
        PreparedStatement preparedStatement;
    
        String query = "create if not exists table produtos (id NOT NULL AUTO_INCREMENT, titulo varchar(255) NOT NULL, autor varchar(255) NOT NULL, isbn varchar(255) NOT NULL, editora varchar(255) NOT NULL, genero varchar(255) NOT NULL, ano varchar(255) NOT NULL), PRIMARY KEY(id)";
    
        preparedStatement = conn.prepareStatement(query);
        preparedStatement.execute();

        System.out.println("Tabela criada!");
    }

}
