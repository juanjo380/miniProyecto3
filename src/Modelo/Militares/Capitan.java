package modelo.Militares;

import modelo.OperacionesMilitares;

public class Capitan extends Soldado implements OperacionesMilitares {
    private int cantidadSoldadosBajoSuMando;

    public Capitan(String nombre, String id, int cantidadSoldadosBajoSuMando) {
        super(4, nombre, id);
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    public int getCantidadSoldadosBajoSuMando() {
        return cantidadSoldadosBajoSuMando;
    }

    public void setCantidadSoldadosBajoSuMando(int cantidad) {
        this.cantidadSoldadosBajoSuMando = cantidad;
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Misión asignada al Capitán: " + mision);
    }

    @Override
    public void reportarEstado() {
        System.out.println("Capitán liderando " + cantidadSoldadosBajoSuMando + " soldados.");
    }

    @Override
    public void realizarAccion() {
        System.out.println("Capitán coordinando misiones.");
    }
}