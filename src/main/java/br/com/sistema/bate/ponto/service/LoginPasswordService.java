package br.com.sistema.bate.ponto.service;

import br.com.sistema.bate.ponto.dtos.LoginPasswordDTO;

public interface LoginPasswordService {

    LoginPasswordDTO verifyLoginAndPassword(LoginPasswordDTO loginPasswordDTO);
}
