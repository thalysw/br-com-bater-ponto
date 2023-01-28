package br.com.sistema.bate.ponto.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Ocultará os itens que estiverem nulos
@Table(name = "TB_USER")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private Long age;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "SEXO")
    private String sexo;

}
