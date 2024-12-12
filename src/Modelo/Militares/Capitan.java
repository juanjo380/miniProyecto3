package Modelo.Militares;

import Modelo.Misiones.OperacionesMilitares;
import Modelo.Rango.Rango;

public class Capitan extends Rango implements OperacionesMilitares{
    private int soldados_bajo_mando;

    public Capitan(int nivel, int soldados_bajo_mando) {
        super(4);
        this.soldados_bajo_mando = soldados_bajo_mando;
    }

    @Override
    public void asignarMision(String mision) {
        
        System.out.println("Mision asignada al capitan: " + mision);
    }

    @Override
    public void reportarEstado() {
        
        System.out.println("Estado del Capitán: Liderando " + soldados_bajo_mando);
    }

    @Override
    public void realizarAccion() {
       
        System.out.println("Capitán coordinando misiones.");
    }
    
}