package org.ejercicio1y2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio2 {
    protected static final Scanner scanner = new Scanner(System.in);
    private static final  Logger LOGGER = Logger.getLogger("org.ejercicio1y2");
    double variable1;
    double variable2;
    public Ejercicio2(){

    }
public void getVariables(){
    LOGGER.info("Ingrese el primer numero a comparar: ");
    this.variable1= scanner.nextDouble();
    LOGGER.info("Ingrese el segundo numero a comparar: ");
    this.variable2= scanner.nextDouble();

}
    public void mostrarComparacion2(){
        if (this.variable1<this.variable2){
LOGGER.info("La variable 1 es menor con un valor de "+variable1+" que la variable dos con un valor de "+variable2);
        }else if(this.variable2<this.variable1){
            LOGGER.info("La variable 1 es mayor con un valor de "+variable1+" que la variable dos con un valor de "+variable2);

        }else{
            LOGGER.info("La variable 1 y la variable 2 son iguales");

        }
    }
}
