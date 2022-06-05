package org.ejercicio17;

import java.util.Arrays;
import java.util.List;

/**
 *Clase perteneciente a la solucion del ejercicio 17, tiene como atributos las caracteristicas basicas
 * de un electrodomestico
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Electrodomestico {
    protected final int precioBase;
    protected final String color;
    protected final char consumoEnergetico;
    protected final int peso;

    private final List <String> colores = Arrays.asList("blanco","negro","rojo","azul","gris");

    /**
     * Es el constructor por defecto e inicializa los atributos segun los requerimientos estandar
     * @constructor
     */
    public Electrodomestico() {
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
        this.precioBase = 100;
    }

    /**
     * Constructor que recibe como parametros el precio base y el peso, el resto son valores por defecto
     * @constructor
     * @param precioBase
     * @param peso
     */
    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
    }

    /**
     * Metodo constructor que instancia el objeto con todos los parametros ingresados,
     * adicionalmente realiza una validacion para los atributos de color y consumo energetico
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     */
    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        if(comprobarConsumoEnergetico(consumoEnergetico)){
            this.consumoEnergetico = 'F';
        }else {
            this.consumoEnergetico = consumoEnergetico;
        }
        if(comprobarColor(color)){
            this.color=color;
        }else{
            this.color="blanco";
        }




    }

    /**
     *
     * Metodos Getter
     */
    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    /**
     * Verifica si el valor ingresado es una letra diferente al rango A-F
     * @param letra
     * @return {boolean}
     */
    private boolean comprobarConsumoEnergetico(char letra) {
        return letra>'F';
    }

    /**
     * Comprueba si el color ingresado para instanciar el objeto esta dentro de la lista
     * de los colores disponibles en la tienda
     * @param color
     * @return {boolean}
     */
    public boolean comprobarColor(String color){
      for(int i=0;i<colores.size();i++){
           String colorElement = colores.get(i);

           if(colorElement.equalsIgnoreCase(color)){
               return true;
           }

      }
      return false;
    }

    /**
     * Metodo que suma al precio base segun las caracteristicas del electrodomestico unos valores determinados
     * @return {int}
     */
    public int precioFinal(){
        int precio=this.precioBase;
        switch (this.consumoEnergetico){
            case 'A'-> precio+=100;
            case 'B'-> precio+=80;
            case 'C'->precio+=60;
            case 'D'->precio+=50;
            case 'E'-> precio+=30;
            case 'F'-> precio+=10;
            default -> precio=0;
        }
       if(this.peso<=19){
           precio+=10;
       }
       if(this.peso>=20&&this.peso<=49){
           precio+=50;
       }
       if(this.peso>=50&&this.peso<=79){
           precio+=80;
       }
       if(this.peso>=80){
           precio+=100;
       }
       
        return precio;
    }


}