package org.ejercicio17;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico {
    protected final int precioBase;
    protected final String color;
    protected final char consumoEnergetico;
    protected final int peso;

    private final List <String> colores = Arrays.asList("blanco","negro","rojo","azul","gris");


    public Electrodomestico() {
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
        this.precioBase = 100;
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
    }

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


    private boolean comprobarConsumoEnergetico(char letra) {
        return letra>'F';
    }
    public boolean comprobarColor(String color){
      for(int i=0;i<colores.size();i++){
           String colorElement = colores.get(i);

           if(colorElement.equalsIgnoreCase(color)){
               return true;
           }

      }
      return false;
    }

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