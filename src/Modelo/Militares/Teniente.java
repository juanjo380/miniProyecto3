package Modelo.Militares;

import Modelo.Misiones.OperacionesMilitares;
import Modelo.Rango.Rango;

public class Teniente extends Rango implements OperacionesMilitares{
    private String unidad;

    public Teniente(int nivel, String unidad) {
        super(3);
        this.unidad = unidad;
    }

    @Override
    public void asignarMision(String mision) {
        
        System.out.println("Mision asignada al teniente: " + mision);
    }

    @Override
    public void reportarEstado() {
        
        System.out.println("Estado del teniente: Liderando unidad " + unidad);
    }

    @Override
    public void realizarAccion() {
        
        System.out.println("Teniente supervisando soldados");
    }
    
}
