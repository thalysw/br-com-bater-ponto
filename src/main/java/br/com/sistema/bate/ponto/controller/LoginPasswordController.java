package br.com.sistema.bate.ponto.controller;

import br.com.sistema.bate.ponto.dtos.LoginPasswordDTO;
import br.com.sistema.bate.ponto.service.LoginPasswordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginPasswordController {

    private static final Logger logger = LoggerFactory.getLogger(LoginPasswordController.class);

    @Autowired
    LoginPasswordService loginPasswordService;

    @GetMapping
    public ResponseEntity<LoginPasswordDTO> verifyLoginAndPassword (@RequestBody LoginPasswordDTO loginPasswordDTO) {
        logger.info("CONTROLLER - Using verifyLoginAndPassword method");
        LoginPasswordDTO loginPasswordDTOReturn = loginPasswordService.verifyLoginAndPassword(loginPasswordDTO);
        logger.info("LoginPasswordReturn: {}", loginPasswordDTOReturn);
        return ResponseEntity.status(HttpStatus.OK).body(loginPasswordDTOReturn);
    }
}
