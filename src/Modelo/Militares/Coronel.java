package Modelo.Militares;

import Modelo.Rango.Rango;

public class Coronel extends Rango {
    private String estrategia;

    public Coronel(String estrategia) {
        super(2);
        this.estrategia = estrategia;
    }
    
}
