package org.ejercicio5y6;

import java.util.logging.Logger;

public class Ejercicio5 {
    int contador;

    private static final Logger LOGGER = Logger.getLogger("org.ejercicio5");
    public Ejercicio5(){
        this.contador=0;
    }
    public void imprimirEjercicio5(){

        LOGGER.info("Estos son los numeros del 1 al 100: ");
        while (contador<=100){

            if(contador % 2 == 0){
                LOGGER.info(contador+" Par");
                contador++;

            }else{
                LOGGER.info(contador+" Impar");
                contador++;
            }


        }
    }
}
