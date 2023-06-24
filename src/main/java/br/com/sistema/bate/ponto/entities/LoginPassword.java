package br.com.sistema.bate.ponto.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Ocultará os itens que estiverem nulos
@Table(name = "TB_LOGIN_PASSWORD")
@Entity
public class LoginPassword {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "DATE_TIME_LOGGED")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyy HH:mm:ss")
    private LocalDateTime dateTimeLogged;
    @Column(name = "USER_LOGGED")
    private Boolean userLogged;
}
