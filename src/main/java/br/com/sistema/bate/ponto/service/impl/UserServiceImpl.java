package br.com.sistema.bate.ponto.service.impl;

import br.com.sistema.bate.ponto.dtos.UserDTO;
import br.com.sistema.bate.ponto.entities.User;
import br.com.sistema.bate.ponto.repository.UserRepository;
import br.com.sistema.bate.ponto.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO save(UserDTO userDTO) {

        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user.setLogin(userDTO.getLogin());
        user.setPassword(userDTO.getPassword());
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setSexo(userDTO.getSexo());
        user.setCpf(userDTO.getCpf());
        userRepository.save(user);

        UserDTO userReturn = new UserDTO();
        BeanUtils.copyProperties(user, userReturn);

        return userReturn;
    }

    @Override
    public UserDTO findUserByLogin(String login) {
        User user = userRepository.findUserByLogin(login);

        UserDTO userReturn = new UserDTO();
        BeanUtils.copyProperties(user, userReturn);

        return userReturn;
    }

    @Override
    public Boolean verifyLoginAndPassword() {
        return null;
    }
}
