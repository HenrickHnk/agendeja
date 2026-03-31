package com.agendamento.agendeja.model.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "categoriaServico")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor  //Construtor padrão
@AllArgsConstructor //Construtor com todos os atributos
@Builder            //Forma diferenciada para criar objetos
public class CategoriaServico {

    @Id     //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento (identificado sequencialmente de 1 em 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false, length = 100)
    private String nomeCategoria;

    @Column(nullable = true, length = 200)
    private String descricao;

}
