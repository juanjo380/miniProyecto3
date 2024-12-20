package modelo.Militares;

import modelo.Rango;

public class Soldado extends Rango {
    private String nombre;
    private String id;
    private static int contadorSoldados = 0;

    public Soldado(int nivel, String nombre, String id) {
        super(nivel);
        this.nombre = nombre;
        this.id = id;
        contadorSoldados++;
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

    public static int getContadorSoldados() {
        return contadorSoldados;
    }

    public void mostrarInformacion() {
        System.out.println("- Informacion del Soldado -");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
    }

    @Override
    public void realizarAccion() {
        System.out.println("Soldado en posición.");
    }
}