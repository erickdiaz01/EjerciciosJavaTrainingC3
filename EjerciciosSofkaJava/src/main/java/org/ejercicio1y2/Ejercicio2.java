package org.ejercicio1y2;

import java.util.Scanner;

/**
 *Clase perteneciente al ejercicio 2, tiene dos atributos enteros que son ingresados por el usuario
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio2 {
    protected static final Scanner scanner = new Scanner(System.in);

    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");
    double variable1;
    
    double variable2;

    /**
     * Los valores de los atributos son iniciados mediante el ingreso de datos por el usuario
     * @constructor
     */
    public Ejercicio2(){
getVariables();
    }

    /**
     *Metodo que imprime un mensaje para pedir cada variable numerica
     */
    public void getVariables(){
    logger.info("Ingrese el primer numero a comparar: ");
    this.variable1= scanner.nextDouble();
    logger.info("Ingrese el segundo numero a comparar: ");
    this.variable2= scanner.nextDouble();

}

    /**
     * Muestra la comparacion entre los dos numeros ingresados por consola
     */
    public void mostrarComparacion2(){
        if (this.variable1<this.variable2){
logger.info("La variable 1 es menor con un valor de "+variable1+" que la variable dos con un valor de "+variable2);
        }else if(this.variable2<this.variable1){
            logger.info("La variable 1 es mayor con un valor de "+variable1+" que la variable dos con un valor de "+variable2);

        }else{
            logger.info("La variable 1 y la variable 2 son iguales");

        }
    }
}
