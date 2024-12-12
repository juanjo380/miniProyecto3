package Modelo.Militares;

import Modelo.Misiones.OperacionesMilitares;
import Modelo.Rango.Rango;

public class SoldadoRaso extends Rango implements OperacionesMilitares {
    public SoldadoRaso(int nivel, String nombre, String id) {
        super(1);
        this.nivel = 1; 
    }

    @Override
    public void asignarMision(String mision) {
        
        System.out.println("Misión asignada al Soldado Raso: " + mision);
    }

    @Override
    public void reportarEstado() {
        
        System.out.println("Estado del Soldado Raso: En posición de ataque");
    }

    @Override
    public void realizarAccion() {
        
        System.out.println("Soldado raso en posición de ataque");
    }
}
