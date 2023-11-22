package com.booker.domain;

import java.sql.SQLException;

import com.booker.infrastructure.dao.LivrosDAO;
import com.booker.infrastructure.entities.Livro;

public class LivroService {
    public Livro resgatarLivro(String isbn) throws SQLException, Exception{
        LivrosDAO livrosDAO = new LivrosDAO();
        return livrosDAO.resgatar(isbn);
    }

    public void criarLivro() throws SQLException, Exception{
        LivrosDAO livrosDAO = new LivrosDAO();
        livrosDAO.criar();
    }
}
