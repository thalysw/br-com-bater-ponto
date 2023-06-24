package br.com.sistema.bate.ponto.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserUpdatePasswordDTO {

    private Long id;
    private String login;
    private String oldPassword;
    private String newPassword;
    private String confirmNewPassword;
}
