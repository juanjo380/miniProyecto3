package Controlador;

import Modelo.ModeloMilitar;
import Modelo.Militares.Soldado;
import java.util.List;

public class ControladorMilitar {
    private ModeloMilitar modelo;

    public ControladorMilitar() {
        modelo = new ModeloMilitar();
    }

    // Métodos para interactuar con la vista
    public void agregarSoldado(Soldado soldado) {
        modelo.agregarSoldado(soldado);
    }

    public List<Soldado> obtenerSoldados() {
        return modelo.obtenerSoldados();
    }

    public void actualizarSoldado(Soldado soldado) {
        modelo.actualizarSoldado(soldado);
    }

    public void eliminarSoldado(String id) {
        modelo.eliminarSoldado(id);
    }

    public List<Soldado> buscarPorRango(Class<?> rangoClase) {
        return modelo.buscarPorRango(rangoClase);
    }

    public void asignarMision(String idSoldado, String mision) {
        modelo.asignarMision(idSoldado, mision);
    }

    public void reportarEstado(String idSoldado) {
        modelo.reportarEstadoSoldado(idSoldado);
    }
}
