package br.com.sistema.bate.ponto.serviceMapper;

import br.com.sistema.bate.ponto.dtos.LoginPasswordDTO;
import br.com.sistema.bate.ponto.entities.LoginPassword;
import org.springframework.beans.BeanUtils;

public class LoginPasswordMapper {

    // Model to DTO
    public static LoginPasswordDTO makeLoginPasswordDTO (LoginPassword loginPassword){
        LoginPasswordDTO loginPasswordDTO = new LoginPasswordDTO();
        BeanUtils.copyProperties(loginPassword, loginPasswordDTO);
        return loginPasswordDTO;
    }

    // DTO to Model
    public static LoginPassword makeLoginPasswordEntity (LoginPasswordDTO loginPasswordDTO){
        LoginPassword loginPassword = new LoginPassword();
        BeanUtils.copyProperties(loginPasswordDTO, loginPassword);
        return loginPassword;
    }
}
