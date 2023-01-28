package br.com.sistema.bate.ponto.service;

import br.com.sistema.bate.ponto.dtos.UserDTO;

public interface UserService {
    UserDTO save(UserDTO userDTO);

    UserDTO findUserByLogin(String login);
}
