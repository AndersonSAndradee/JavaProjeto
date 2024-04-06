package br.com.book.entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "livro")
@Entity
public class Entidade { // Criação da Entidade(Tabela Livro )
    @Id // Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
  
    @Column(nullable = false, length = 100)
    private String titulo; // Renomeado para "titulo" para corresponder ao campo na tabela MySQL

    @Column(nullable = false, length = 150)
    private String autor_principal; // Renomeado para "autor_principal" para corresponder ao campo na tabela MySQL

    @Column(nullable = false)
    private int ano_publicacao; // Mantido como está

    @Column(nullable = false)
    private int edicao; // Mantido como está

    @Column(nullable = false)
    private LocalDateTime data_criacao; // Mantido como está

    @Column(nullable = true) // Ajustado para permitir NULL, já que a tabela MySQL permite NULL
    private LocalDateTime data_alteracao; // Mantido como está

    // Getters e setters (não mostrados para brevidade)

    //Acesso ao atributo ID (Método construtor ID)
    public void setId(long id) {
        this.id = id; //Acesso ao atributo ID 
    }
}

