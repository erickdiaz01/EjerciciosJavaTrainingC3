package org.ejercicio8;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio8 {
String dia;
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio8");
    protected static final Scanner scanner = new Scanner(System.in);

    public Ejercicio8 (){

    }
    public void menu(){
        LOGGER.info("Ingrese un día de la semana para saber si es laborar: " +
                "[L] Lunes "+"[M] Martes "+"[W] Miercoles "+"[J] Jueves "+ "[V] Viernes "+"[S] Sabado "+"[D] Domingo ");
this.dia= scanner.nextLine();
mostrarLaboral();
    }
    public void mostrarLaboral(){
        switch (dia){
            case "L": case "M": case"W": case"J": case"V":
                LOGGER.info("Usted seleccionó el dia ["+dia+"] y es un dia laboral");
                break;

            case "S": case "D":
                LOGGER.info("Usted seleccionó el dia [" +dia+ "] y no es un dia laboral");
                break;
            default:
               menu();

        }
    }
}
