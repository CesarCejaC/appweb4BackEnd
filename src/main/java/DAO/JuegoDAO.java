package DAO;

import entities.Juego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JuegoDAO extends JpaRepository<Juego, Long> {
}
