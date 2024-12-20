package modelo;

import modelo.Militares.Soldado;

import java.util.ArrayList;
import java.util.List;

public class ModeloMilitar {
    private List<Soldado> soldados;

    public ModeloMilitar() {
        soldados = new ArrayList<>();
    }

    // CRUD para soldados
    public void agregarSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public List<Soldado> obtenerSoldados() {
        return new ArrayList<>(soldados);
    }

    public void actualizarSoldado(Soldado soldado) {
        for (int i = 0; i < soldados.size(); i++) {
            if (soldados.get(i).getId().equals(soldado.getId())) {
                soldados.set(i, soldado);
                return;
            }
        }
    }

    public void eliminarSoldado(String id) {
        soldados.removeIf(s -> s.getId().equals(id));
    }

    // Buscar soldados por rango
    public List<Soldado> buscarPorRango(Class<?> rangoClase) {
        List<Soldado> resultado = new ArrayList<>();
        for (Soldado s : soldados) {
            if (rangoClase.isInstance(s)) {
                resultado.add(s);
            }
        }
        return resultado;
    }

    // Asignar misión
    public void asignarMision(String idSoldado, String mision) {
        for (Soldado soldado : soldados) {
            if (soldado.getId().equals(idSoldado)) {
                if (soldado instanceof OperacionesMilitares) {
                    ((OperacionesMilitares) soldado).asignarMision(mision);
                }
                return;
            }
        }
    }

    // Reportar estado
    public void reportarEstadoSoldado(String idSoldado) {
        for (Soldado soldado : soldados) {
            if (soldado.getId().equals(idSoldado)) {
                if (soldado instanceof OperacionesMilitares) {
                    ((OperacionesMilitares) soldado).reportarEstado();
                }
                return;
            }
        }
    }
}
