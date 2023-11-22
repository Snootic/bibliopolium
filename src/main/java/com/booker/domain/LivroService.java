package com.booker.domain;

import java.sql.SQLException;

import com.booker.application.dto.LivroDTO;
import com.booker.infrastructure.dao.LivrosDAO;
import com.booker.infrastructure.entities.Livro;

public class LivroService {
    public LivroDTO resgatarLivro(String isbn) throws SQLException, Exception{
        LivrosDAO livrosDAO = new LivrosDAO();
        return new LivroDTO(livrosDAO.resgatar(isbn));
    }

    public void criarLivro(LivroDTO livroInputDTO) throws SQLException, Exception{
        LivrosDAO livrosDAO = new LivrosDAO();
        livrosDAO.criar(new Livro(livroInputDTO));
    }
}
