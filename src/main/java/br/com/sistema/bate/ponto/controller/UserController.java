package br.com.sistema.bate.ponto.controller;

import br.com.sistema.bate.ponto.dtos.UserDTO;
import br.com.sistema.bate.ponto.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping()
    public ResponseEntity<UserDTO> newUser(@RequestBody UserDTO userDTO) {
        UserDTO user = userService.save(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/login")
    public ResponseEntity<UserDTO> findUserByLogin (@RequestParam(value = "login") String login) {
        UserDTO user = userService.findUserByLogin(login);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
