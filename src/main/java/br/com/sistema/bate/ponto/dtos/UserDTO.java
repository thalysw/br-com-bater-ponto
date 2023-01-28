package br.com.sistema.bate.ponto.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String login;
    private String password;
    private String name;
    private Long age;
    private String phoneNumber;
    private String cpf;
    private String sexo;

}
