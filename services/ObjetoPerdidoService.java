package services;

import model.ObjetoPerdido;

import java.util.ArrayList;
import java.util.List;

public class ObjetoPerdidoService {
    private List<ObjetoPerdido> listaObjetosPerdidos;

    public ObjetoPerdidoService() {
        listaObjetosPerdidos = new ArrayList<>();
    }

    public void registrarObjeto(ObjetoPerdido objeto) {
        listaObjetosPerdidos.add(objeto);
    }

    public ObjetoPerdido buscarObjeto(String palabraClave) {
        for (ObjetoPerdido obj : listaObjetosPerdidos) {
            if (obj.getDescripcion().toLowerCase().contains(palabraClave.toLowerCase())) {
                return obj;
            }
        }
        return null;
    }

    public List<ObjetoPerdido> getTodosLosObjetos() {
        return listaObjetosPerdidos;
    }
}
