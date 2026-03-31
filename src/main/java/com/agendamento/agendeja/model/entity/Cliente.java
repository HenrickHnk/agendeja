package com.agendamento.agendeja.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("CLIENTE")
@Getter
@Setter
@NoArgsConstructor  //Construtor padrão
@AllArgsConstructor //Construtor com todos os atributos
public class Cliente extends Usuario {

    @Column(nullable = true, length = 11)
    private String cpf;

}
