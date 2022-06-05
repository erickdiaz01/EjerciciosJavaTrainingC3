package org.ejercicio17;

public class Television extends  Electrodomestico{
    private final int pulgadas;
    private final boolean TDT;

    public Television() {
        this.pulgadas = 20;
        this.TDT = false;
    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
        this.pulgadas = 20;
        this.TDT = false;
    }

    public Television(int precioBase, String color, char consumoEnergetico, int peso, int pulgadas, boolean TDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }
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
