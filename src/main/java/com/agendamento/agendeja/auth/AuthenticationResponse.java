package com.agendamento.agendeja.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

//Classe resposável em gerar a resposta para o cliente, ou seja, retornará o "token"

@Getter
@AllArgsConstructor
public class AuthenticationResponse {

    @JsonProperty("access_token")
    private final String accessToken;

    @JsonProperty ("refresh_token")
    private final String refreshToken;


}
