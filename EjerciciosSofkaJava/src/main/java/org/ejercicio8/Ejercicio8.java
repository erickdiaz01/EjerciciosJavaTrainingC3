package org.ejercicio8;

import java.util.Scanner;
/**
 *Clase perteneciente a la solucion del ejercicio 8, tiene un atributo que es el dia el cual el usuario ingresa
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio8 {
String dia;
    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");
    protected static final Scanner scanner = new Scanner(System.in);

    /**
     * Cuando se invoca captura el valor del atributo y a su vez imprime el mensaje de la comparacion gracias al
     * metodo menu
     * @constructor
     */
    public Ejercicio8 (){
     menu();
    }

    /**
     * Muestra el menu para que el usuario eliga una letra para indicar el dia a evaluar,
     * invoca el metodo mostrarLaborar para ver si es laboral el dia
     */
    public void menu(){
        logger.info("Ingrese un día de la semana para saber si es laborar: " +
                "[L] Lunes "+"[M] Martes "+"[W] Miercoles "+"[J] Jueves "+ "[V] Viernes "+"[S] Sabado "+"[D] Domingo ");
this.dia= scanner.nextLine();
mostrarLaboral();
    }

    /**
     * Contiene la logica para imprimir el mensaje que indica si es laboral o no el dia ingresado
     */
    public void mostrarLaboral(){
        switch (dia){
            case "L","M","W","J","V":
                logger.info("Usted seleccionó el dia ["+dia+"] y es un dia laboral");
                break;

            case "S","D":
                logger.info("Usted seleccionó el dia [" +dia+ "] y no es un dia laboral");
                break;
            default:
               menu();

        }
    }
}
