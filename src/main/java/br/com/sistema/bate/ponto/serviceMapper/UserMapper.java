package br.com.sistema.bate.ponto.serviceMapper;

import br.com.sistema.bate.ponto.dtos.UserDTO;
import br.com.sistema.bate.ponto.entities.User;
import org.springframework.beans.BeanUtils;

public class UserMapper {

    // Model to DTO
    public static UserDTO makeUserDto (User userEntity) {
        UserDTO user = new UserDTO();
        BeanUtils.copyProperties(userEntity, user);

        return user;
    }

    // DTO to Model
    public static User makeUserEntity (UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);

        return user;
    }
}
