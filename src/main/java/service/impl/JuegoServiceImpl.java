package service.impl;

import DAO.JuegoDAO;
import entities.Juego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.JuegoService;

import java.util.List;

@Service
public class JuegoServiceImpl  implements JuegoService {

    @Autowired
    private JuegoDAO juegoDAO;

    public void save(Juego juego){
        juegoDAO.save(juego);
    }

    public List<Juego> viewAll() {
        return juegoDAO.findAll();
    }
}
