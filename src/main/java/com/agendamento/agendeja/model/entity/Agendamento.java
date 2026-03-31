package com.agendamento.agendeja.model.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "agendamento")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor  //Construtor padrão
@AllArgsConstructor //Construtor com todos os atributos
@Builder            //Forma diferenciada para criar objetos
public class Agendamento {


    @Id     //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento (identificado sequencialmente de 1 em 1)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(nullable = false)
    private LocalDateTime dataHoraInicio;
    @Column(nullable = false)
    private LocalDateTime dataHoraFim;
    @Column(nullable = false, length = 20)
    private String status;
    private boolean codStatus;


    // Relacionamento entre as classes
    // Many = Muitos pedidos para One = Um cliente
    @ManyToOne(cascade = CascadeType.MERGE,  fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id" , referencedColumnName = "id", nullable = false)
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.MERGE,  fetch = FetchType.EAGER)
    @JoinColumn(name = "agendaHorario_id" , referencedColumnName = "id", nullable = false)
    private AgendaHorario agendaHorario;

    @ManyToOne(cascade = CascadeType.MERGE,  fetch = FetchType.EAGER)
    @JoinColumn(name = "servico_id" , referencedColumnName = "id", nullable = false)
    private Servico servico;


}
