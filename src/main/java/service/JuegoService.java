package service;

import entities.Juego;

import java.util.List;

public interface JuegoService {
    public void save(Juego juego);

    public List<Juego> viewAll();
}
