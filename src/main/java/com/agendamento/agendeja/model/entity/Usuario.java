package com.agendamento.agendeja.model.entity;


import com.agendamento.agendeja.model.enums.TipoUsuario;
import jakarta.persistence.*;


@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Informa que o padrão utilizado é uma única tabela para todos os usuários
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)//Informa qual é o nome da coluna que vai ser utilizado
public class Usuario {

    @Id     //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento (identificado sequencialmente de 1 em 1)
    private Long id;
    @Column(nullable = true, length = 100)
    private String nome;
    @Column(nullable = false, length = 8)
    private String telefone;
    @Column(nullable = true, length = 45)
    private String email;
    @Column(nullable = true, length = 250)
    private String password;
    @Column(nullable = true, length = 100)
    private String endereco;
    @Column(nullable = true, length = 100)
    private String cidade;
    @Column(nullable = true, length = 100)
    private String estado;


    @Column(name = "tipo_usuario", insertable = false, updatable = false)
    private TipoUsuario tipoUsuario;

    private boolean codStatus;

}
