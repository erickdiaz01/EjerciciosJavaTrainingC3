package org.ejercicio5y6;

import java.util.logging.Logger;

public class Ejercicio6 {
    int contador;

    private static final Logger LOGGER = Logger.getLogger("org.ejercicio6");
    public Ejercicio6(){
this.contador=0;
    }
    public void imprimirEjercicio6(){

        LOGGER.info("Estos son los numeros del 1 al 100: ");
       for(this.contador=0; this.contador<=100; this.contador += 1){
           if(contador % 2 == 0){
               LOGGER.info(contador+" Par");


           }else{
               LOGGER.info(contador+" Impar");

           }
       }
    }
}
