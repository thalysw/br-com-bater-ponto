package br.com.sistema.bate.ponto.repository;

import br.com.sistema.bate.ponto.entities.LoginPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginPasswordRepository extends JpaRepository<LoginPassword, String> {
}
