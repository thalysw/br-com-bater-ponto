package br.com.sistema.bate.ponto.repository;

import br.com.sistema.bate.ponto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
