package Modelo.Militares;

import Modelo.Rango.Rango;

public class Teniente extends Rango {
    private String unidad;

    public Teniente(int nivel, String unidad) {
        super(3);
        this.unidad = unidad;
    }
    
}
