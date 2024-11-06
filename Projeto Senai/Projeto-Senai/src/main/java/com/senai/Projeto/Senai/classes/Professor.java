package com.senai.Projeto.Senai.classes;

import jakarta.persistence.*;

@Entity
@Table(name="professores")

public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @Column(name="Nome")
    private String nome;
    @Column(name="Departamento  ")
    private String departamento;
}
