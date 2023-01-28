package br.com.sistema.bate.ponto.service.impl;

import br.com.sistema.bate.ponto.dtos.LoginPasswordDTO;
import br.com.sistema.bate.ponto.dtos.UserDTO;
import br.com.sistema.bate.ponto.entities.LoginPassword;
import br.com.sistema.bate.ponto.repository.LoginPasswordRepository;
import br.com.sistema.bate.ponto.service.LoginPasswordService;
import br.com.sistema.bate.ponto.service.UserService;
import br.com.sistema.bate.ponto.serviceMapper.LoginPasswordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LoginPasswordServiceImpl implements LoginPasswordService {

    @Autowired
    UserService userService;

    @Autowired
    LoginPasswordRepository loginPasswordRepository;

    @Override
    public LoginPasswordDTO verifyLoginAndPassword(LoginPasswordDTO loginPasswordDTO) {
        UserDTO user = userService.findUserByLogin(loginPasswordDTO.getLogin());
        LoginPasswordDTO loginPasswordReturn = new LoginPasswordDTO();
        if(user != null) {
            if (user.getLogin().equals(loginPasswordDTO.getLogin())
                    && user.getPassword().equals(loginPasswordDTO.getPassword())) {
                LoginPassword loginPassword = LoginPasswordMapper.makeLoginPasswordEntity(loginPasswordDTO);
                loginPassword.setDateTimeLogged(LocalDateTime.now());
                loginPassword.setUserLogged(true);
                loginPasswordRepository.save(loginPassword);

                loginPasswordReturn = LoginPasswordMapper.makeLoginPasswordDTO(loginPassword);

                return loginPasswordReturn;
            }
        }
        loginPasswordReturn.setUserLogged(false);
        return loginPasswordReturn;
    }
}
