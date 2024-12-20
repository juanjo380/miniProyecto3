package Modelo.Militares;

import Modelo.OperacionesMilitares;

public class Teniente extends Soldado implements OperacionesMilitares {
    private String unidad;

    public Teniente(String nombre, String id, String unidad) {
        super(3, nombre, id);
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Misión asignada al Teniente: " + mision);
    }

    @Override
    public void reportarEstado() {
        System.out.println("Teniente liderando unidad: " + unidad);
    }

    @Override
    public void realizarAccion() {
        System.out.println("Teniente supervisando soldados.");
    }
}
