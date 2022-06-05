package org.ejercicio17;

public class Lavadora extends Electrodomestico{
private final int carga;

    public Lavadora() {

        this.carga = 5;
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }


    public int precioFinal(){
        int precioPadre= super.precioFinal();
        if(this.carga>30){
            precioPadre+=50;
        }
        return precioPadre;
    }
}
