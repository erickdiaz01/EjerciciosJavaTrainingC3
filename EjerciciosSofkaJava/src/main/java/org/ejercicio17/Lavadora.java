package org.ejercicio17;
/**
 *Clase perteneciente a la solucion del ejercicio 17, tiene como atributos las caracteristicas basicas
 * de un electrodomestico Lavadora
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Lavadora extends Electrodomestico{
private final int carga;
    /**
     * Es el constructor por defecto e inicializa los atributos segun los requerimientos estandar
     * @constructor
     */
    public Lavadora() {

        this.carga = 5;
    }
    /**
     * Constructor que recibe como parametros el precio base y el peso, el resto son valores por defecto
     * @constructor
     * @param precioBase
     * @param peso
     */
    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = 5;
    }
    /**
     * Metodo constructor que instancia el objeto con todos los parametros ingresados,
     * adicionalmente realiza una validacion para los atributos de color y consumo energetico
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     * @param carga
     */
    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /**
     * Getter de la subclase Lavadora
     * @return {carga}
     */
    public int getCarga() {
        return carga;
    }

    /**
     * Le agrega una condicion al metodo de la clase super para aumentar el precio o no del electrodomestico
     * @return
     */
    @Override
    public int precioFinal(){
        int precioPadre= super.precioFinal();
        if(this.carga>30){
            precioPadre+=50;
        }
        return precioPadre;
    }
}
