package org.ejercicio3;


import java.util.Scanner;

/**
 * Clase perteneciente al ejercicio 3, tiene 2 atributos, el radio y las unidades de este
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio3Circulo {
    protected static final Scanner scanner = new Scanner(System.in);
    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    double radio;
    String unidades;

    /**
     * Se construye el objeto mediante el metodo para pedir los valores del radio y las unidades
     * @constructor
     */
    public Ejercicio3Circulo(){
getRadio();
    }

    /**
     * Metodo que imprime mensajes en la pantalla para pedir los dos valores de los atributos
     */
    public void getRadio(){
logger.info("Ingrese el radio del circulo para calcular el area");
String radioStr =scanner.nextLine();
radioStr=radioStr.replace(",",".");
this.radio = Double.parseDouble(radioStr);
logger.info("Ingrese las unidades de longitud del radio");
this.unidades = scanner.next();
    }

    /**
     *Metodo que calcula el area de un circulo a partir del atributo radio
     * @return El valor del area de un circulo
     */
    public double calcularArea(){

        return  Math.PI*Math.pow(this.radio,2) ;
    }

    /**
     * Metodo que imprime en pantalla el area calculada del circulo
     */
    public void mostrarArea(){
double area = calcularArea();
        if(!String.valueOf(area).equals("")){
            logger.info("El area del circulo con el radio que usted ingresó es: "+ area+ " "+ this.unidades);
        }


    }


}
