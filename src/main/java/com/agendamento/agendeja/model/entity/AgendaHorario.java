package com.agendamento.agendeja.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "agendahorario")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor  //Construtor padrão
@AllArgsConstructor //Construtor com todos os atributos
@Builder            //Forma diferenciada para criar objetos
public class AgendaHorario {

    @Id     //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento (identificado sequencialmente de 1 em 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private LocalTime horaInicio;

    @Column(nullable = false)
    private LocalTime horaFim;

    @Column(nullable = false, length = 20)
    private String status;

    @ManyToOne(cascade = CascadeType.MERGE,  fetch = FetchType.EAGER)
    @JoinColumn(name = "empreendedor_id" , referencedColumnName = "id", nullable = false)
    private Empreendedor empreendedor;

}
