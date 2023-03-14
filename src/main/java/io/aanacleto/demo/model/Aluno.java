package io.aanacleto.demo.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column
    private String cpf;
}
