package org.ejercicio5y6;

/**
 * Clase correspondiente a la solucion del ejercicio 6, tiene un atributo entero contador
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio6 {
    int contador;

    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Inicializa el atributo contador en cero
     * @constructor
     */
    public Ejercicio6(){
this.contador=0;
    }

    /**
     * Imprime los numeros del 1 al 100 con un ciclo for indicando si son pares o impares
     */
    public void imprimirEjercicio6(){

        logger.info("Estos son los numeros del 1 al 100: ");
       for(this.contador=0; this.contador<=100; this.contador += 1){
           if(contador % 2 == 0){
               logger.info(contador+" Par");


           }else{
               logger.info(contador+" Impar");

           }
       }
    }
}
