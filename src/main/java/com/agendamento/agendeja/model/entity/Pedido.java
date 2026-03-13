package com.agendamento.agendeja.model.entity;

import jakarta.persistence.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "pedido")
public class Pedido {


    @Id     //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento (identificado sequencialmente de 1 em 1)
    private Long id;
    private double valorPedido;
    private LocalDateTime dataHoraPedido;
    private LocalDateTime dataHoraEntrega;
    private String status;
    private boolean codStatus;
}
