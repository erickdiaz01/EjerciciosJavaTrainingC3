package org.ejercicio12;

import java.util.Scanner;
/**
 *Clase perteneciente a la solucion del ejercicio 12, tiene como atributos las palabras a comparar
 *y sus diferencias
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio12 {
    String palabra1;
    String palabra2;
    String diferencias;

    protected static final Scanner scanner = new Scanner(System.in);
    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Inicializa los atributos como Strings vacios
     * @constructor
     */
 public Ejercicio12(){
 this.palabra1="";
 this.palabra2="";
 this.diferencias="";
 }

    /**
     * Imprime las peticiones y captura los datos de las palabras a comparar
     */
 public void getPalabras(){
     logger.info("Ingrese la primer palabra: ");
     this.palabra1= scanner.nextLine();
     logger.info("Ingrese la segunda palabra: ");
     this.palabra2 = scanner.nextLine();

 }

    /**
     * Metodo que lleva el algoritmo para comparar las palabras y almacenar sus diferencias
     * @return Un texto con la informacion de las diferencias
     */
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

    /**
     * Imprime el texto de las diferencias entre las palabras
     */
 public void mostrarDiferencias(){
     String mostrandoDiferencias = compararPalabras();
     logger.info(mostrandoDiferencias);

 }
}