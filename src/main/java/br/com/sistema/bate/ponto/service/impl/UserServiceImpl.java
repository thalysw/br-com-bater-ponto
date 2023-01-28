package br.com.sistema.bate.ponto.service.impl;

import br.com.sistema.bate.ponto.dtos.UserDTO;
import br.com.sistema.bate.ponto.entities.User;
import br.com.sistema.bate.ponto.repository.UserRepository;
import br.com.sistema.bate.ponto.service.UserService;
import br.com.sistema.bate.ponto.serviceMapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO save(UserDTO userDTO) {

        User user = UserMapper.makeUserEntity(userDTO);
        userRepository.save(user);
        UserDTO userReturn = UserMapper.makeUserDto(user);

        return userReturn;
    }

    @Override
    public UserDTO findUserByLogin(String login) {
        User user = userRepository.findUserByLogin(login);

        if(user != null) {
            UserDTO userReturn = UserMapper.makeUserDto(user);
            return userReturn;
        }
        return null;

    }

    @Override
    public boolean existsByLogin(String login) {
        return userRepository.existsByLogin(login);
    }
}
