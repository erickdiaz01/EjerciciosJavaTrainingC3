package org.ejercicio18;

/**
 * Interfaz que modela los metodos para manejar el estado de entregado
 */
public interface Entregable {
    public void entregar();
    public void devolver();
    public boolean isEntregado();
    public int compareTo(Object a);
}
