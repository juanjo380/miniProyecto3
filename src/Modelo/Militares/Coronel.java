package Modelo.Militares;

import Modelo.Misiones.OperacionesMilitares;
import Modelo.Rango.Rango;

public class Coronel extends Rango implements OperacionesMilitares {
    private String estrategia;

    public Coronel(String estrategia) {
        super(2);
        this.estrategia = estrategia;
    }

    @Override
    public void realizarAccion() {
        System.out.println("Coronel ordenando misiones importantes.");
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Misión asignada al Coronel: " + mision);
    }

    @Override
    public void reportarEstado() {
        System.out.println("Estado del Coronel: Implementando estrategia " + estrategia);
    }
    
}
