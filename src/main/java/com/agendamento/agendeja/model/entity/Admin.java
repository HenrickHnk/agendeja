package com.agendamento.agendeja.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("ADMIN")
@Getter
@Setter
@NoArgsConstructor  //Construtor padrão
@AllArgsConstructor //Construtor com todos os atributos
public class Admin extends Usuario {

    @Column(nullable = false, length = 20)
    private String nivelAcesso;

}
