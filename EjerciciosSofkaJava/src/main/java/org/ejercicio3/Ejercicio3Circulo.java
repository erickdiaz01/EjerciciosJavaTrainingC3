package org.ejercicio3;


import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio3Circulo {
    protected static final Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio3");

    double radio;
    String unidades;
    public Ejercicio3Circulo(){

    }

    public void getRadio(){
LOGGER.info("Ingrese el radio del circulo para calcular el area");
String radioStr =scanner.nextLine();
radioStr=radioStr.replace(",",".");
this.radio = Double.parseDouble(radioStr);
LOGGER.info("Ingrese las unidades de longitud del radio");
this.unidades = scanner.next();
    }

    public double calcularArea(){

        return  Math.PI*Math.pow(this.radio,2) ;
    }

    public void mostrarArea(){
double area = calcularArea();
        if(String.valueOf(area)!=""){
            LOGGER.info("El area del circulo con el radio que usted ingresó es: "+ area+ " "+ this.unidades);
        }


    }


}
