package org.ejercicio17;

/**
 *Clase perteneciente a la solucion del ejercicio 17, tiene como atributos las caracteristicas basicas
 * de un electrodomestico Television
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Television extends  Electrodomestico{
    private final int pulgadas;
    private final boolean TDT;

    /**
     * Es el constructor por defecto e inicializa los atributos segun los requerimientos estandar
     * @constructor
     */
    public Television() {
        this.pulgadas = 20;
        this.TDT = false;
    }
    /**
     * Constructor que recibe como parametros el precio base y el peso, el resto son valores por defecto
     * @constructor
     * @param precioBase
     * @param peso
     */
    public Television(int precioBase, int peso) {
        super(precioBase, peso);
        this.pulgadas = 20;
        this.TDT = false;
    }

    /**
     * Metodo constructor que instancia el objeto con todos los parametros ingresados,
     * adicionalmente realiza una validacion para los atributos de color y consumo energetico
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     * @param pulgadas
     * @param TDT
     */
    public Television(int precioBase, String color, char consumoEnergetico, int peso, int pulgadas, boolean TDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    /**
     * Metodo getter de las pulgadas del televisor
     * @return {int}
     */
    public int getPulgadas() {
        return pulgadas;
    }

    /**
     * Metodo que determina si tiene o no TDT
     * @return {boolean}
     */
    public boolean isTDT() {
        return TDT;
    }
    /**
     * Le agrega una condicion al metodo de la clase super para aumentar el precio o no del electrodomestico
     * @return
     */
    @Override
    public int precioFinal(){
        int precioPadre= super.precioFinal();
        if(this.pulgadas>40){
            precioPadre+= precioPadre*0.3;

        }
        if(this.TDT){
            precioPadre+=50;
        }
        return precioPadre;
    }
}
