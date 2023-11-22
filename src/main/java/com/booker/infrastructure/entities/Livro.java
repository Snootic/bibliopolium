package com.booker.infrastructure.entities;

import com.booker.application.dto.LivroDTO;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String editora;
    private String genero;
    private String ano;

    public Livro(String titulo, String autor, String isbn, String editora, String genero, String ano){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.genero = genero;
        this.ano = ano;
    }

    public Livro(LivroDTO data){
        this.titulo = data.getTitulo();
        this.autor = data.getAutor();
        this.isbn = data.getISBN();
        this.editora = data.getEditora();
        this.genero = data.getGenero();
        this.ano = data.getAno();
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getISBN(){
        return isbn;
    }

    public String getEditora(){
        return editora;
    }

    public String getGenero(){
        return genero;
    }

    public String getAno(){
        return ano;
    }
}
