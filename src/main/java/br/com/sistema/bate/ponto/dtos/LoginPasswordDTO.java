package br.com.sistema.bate.ponto.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginPasswordDTO {
    private Long id;
    private String login;
    private String password;
    private LocalDateTime dateTimeLogged;
    private Boolean userLogged;
}
