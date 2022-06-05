package org.ejercicio5y6;

/**
 * Clase correspondiente a la solucion del ejercicio 5, tiene un atributo entero contador
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio5 {
    int contador;

    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Metodo que inicializa el atributo contador en cero
     * @constructor
     */
    public Ejercicio5(){
        this.contador=0;
    }

    /**
     * Imprime todos los numeros del 0 al 100 indicando si son pares o impares
     */
    public void imprimirEjercicio5(){

        logger.info("Estos son los numeros del 1 al 100: ");
        while (contador<=100){

            if(contador % 2 == 0){
                logger.info(contador+" Par");
                contador++;

            }else{
                logger.info(contador+" Impar");
                contador++;
            }


        }
    }
}
