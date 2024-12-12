package Modelo.Militares;

import Modelo.Rango.Rango;

public class Soldado extends Rango {
    private String nombre;
    private String id;
    
    public Soldado(int nivel, String nombre, String id) {
        super(nivel);
        this.nombre = nombre;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
}
