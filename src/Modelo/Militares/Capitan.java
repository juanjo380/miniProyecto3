package Modelo.Militares;

import Modelo.Rango.Rango;

public class Capitan extends Rango {
    private int soldados_bajo_mando;

    public Capitan(int nivel, int soldados_bajo_mando) {
        super(4);
        this.soldados_bajo_mando = soldados_bajo_mando;
    }
    
}