package org.ejercicio12;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio12 {
    String palabra1;
    String palabra2;
    String diferencias;

    protected static final Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio10");

 public Ejercicio12(){
 this.palabra1="";
 this.palabra2="";
 this.diferencias="";
 }

 public void getPalabras(){
     LOGGER.info("Ingrese la primer palabra: ");
     this.palabra1= scanner.nextLine();
     LOGGER.info("Ingrese la segunda palabra: ");
     this.palabra2 = scanner.nextLine();

 }
 public String compararPalabras() {
     if (this.palabra1.equals(this.palabra2)) {
         return "La palabra " + this.palabra1 + " es igual a la palabra " + this.palabra2;
     } else {
         if (this.palabra1.length() >= this.palabra2.length()) {
            for(int i=0;i<this.palabra2.length();++i){
                String c1 = String.valueOf(this.palabra1.charAt(i));
                String c2 = String.valueOf(this.palabra2.charAt(i));
                if(!(c1.equalsIgnoreCase(c2))){
                    this.diferencias = this.diferencias+ "La primera palabra tiene la letra " + c1 + " en la " + (i+1) + " posicion y la segunda palabra  no. \n";
                }

            }
            for(int j = this.palabra2.length() ; j<this.palabra1.length();++j){
                String c1 = String.valueOf(this.palabra1.charAt(j));
                this.diferencias = this.diferencias + "La primera palabra tiene la letra "+c1+" en la "+(j+1)+" posicion y la segunda palabra no";

            }
            return this.diferencias;
         } else {
             for(int i=0;i<this.palabra1.length();++i){
                 String c1 = String.valueOf(this.palabra1.charAt(i));
                 String c2 = String.valueOf(this.palabra2.charAt(i));
                 if(!(c1.equalsIgnoreCase(c2))){
                     this.diferencias = this.diferencias+ "La segunda palabra tiene la letra " + c2 + " en la " + (i+1) + " posicion y la primer palabra  no. \n";
                 }

             }
             for(int j = this.palabra1.length() ; j<this.palabra2.length();++j){
                 String c1 = String.valueOf(this.palabra2.charAt(j));
                 this.diferencias = this.diferencias + "La segunda palabra tiene la letra "+c1+" en la "+(j+1)+" posicion y la primera palabra no";

             }


             return this.diferencias;
         }

     }
 }

 public void mostrarDiferencias(){
     String mostrandoDiferencias = compararPalabras();
     LOGGER.info(mostrandoDiferencias);

 }
}