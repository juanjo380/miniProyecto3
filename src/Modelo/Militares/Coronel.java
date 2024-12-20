package modelo.Militares;

import modelo.OperacionesMilitares;

public class Coronel extends Soldado implements OperacionesMilitares {
    private String estrategia;

    public Coronel(String nombre, String id, String estrategia) {
        super(2, nombre, id);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Misión asignada al Coronel: " + mision);
    }

    @Override
    public void reportarEstado() {
        System.out.println("Coronel implementando estrategia: " + estrategia);
    }

    @Override
    public void realizarAccion() {
        System.out.println("Coronel ordenando misiones importantes.");
    }
}