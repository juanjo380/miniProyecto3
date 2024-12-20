package modelo.Militares;

import modelo.OperacionesMilitares;

public class SoldadoRaso extends Soldado implements OperacionesMilitares {

    public SoldadoRaso(String nombre, String id) {
        super(1, nombre, id);
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Misión asignada al Soldado Raso: " + mision);
    }

    @Override
    public void reportarEstado() {
        System.out.println("Soldado Raso en posición de ataque.");
    }

    @Override
    public void realizarAccion() {
        System.out.println("Soldado Raso en posición de ataque.");
    }
}