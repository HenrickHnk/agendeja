package com.agendamento.agendeja.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "servico")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor  //Construtor padrão
@AllArgsConstructor //Construtor com todos os atributos
@Builder            //Forma diferenciada para criar objetos
public class Servico {

    @Id     //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento (identificado sequencialmente de 1 em 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false, length = 50)
    private String nomeServico;

    @Column(nullable = true, length = 200)
    private String descricao;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;

    @Column(nullable = true)
    private LocalDateTime tempoMedio;

    // Relacionamento entre as classes
    // Many = Muitos pedidos para One = Um cliente
    @ManyToOne(cascade = CascadeType.MERGE,  fetch = FetchType.EAGER)
    @JoinColumn(name = "categoriaServico_id" , referencedColumnName = "id", nullable = false)
    private CategoriaServico categoriaServico;

    // Relacionamento entre as classes
    // Many = Muitos pedidos para One = Um cliente
    @ManyToOne(cascade = CascadeType.MERGE,  fetch = FetchType.EAGER)
    @JoinColumn(name = "empreendedor_id" , referencedColumnName = "id", nullable = false)
    private Empreendedor empreendedor;

}
