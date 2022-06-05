package org.ejercicio11;

import java.util.Scanner;

/**
 *Clase perteneciente a la solucion del ejercicio 11, tiene como atributos contadores para cada vocal
 * y para la longitud total del texto
 *
 * @author Erick Diaz
 * @date 05-06-2022
 */
public class Ejercicio11 {
    String texto;
int contadorA;
int contadorE;
int contadorI;
int contadorO;
int contadorU;
int contadorEspacios;
int contadorCaracteres;
    protected static final Scanner scanner = new Scanner(System.in);
    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * Inicializa los atributos contadores en cero
     * @constructor
     */
   public Ejercicio11(){
this.contadorEspacios=0;
this.contadorE=0;
this.contadorU=0;
this.contadorCaracteres=0;
this.contadorA=0;
this.contadorI=0;
this.contadorO=0;
   }

    /**
     * Imprime una peticion para que el usuario ingrese el texto a contabilizar
     */
   public void getTexto(){
       logger.info("Ingrese el texto para saber su longitud y saber cuantas vocales tiene de cada una: ");
       this.texto= scanner.nextLine();
   }

    /**
     * Metodo que contabiliza la cantidad de vocales y de caracteres del texto ingresado por el usuario
     * @return La concatenacion del la informacion de la contabilizacion requerida
     */
   public String textoConInformacionDeContador(){
getTexto();

       for(int i=0; i<this.texto.length();++i){
           char c = this.texto.charAt (i);
           String letra = String.valueOf(c);
           switch (letra){
               case "a","A":
                   this.contadorA+=1;
                   break;
               case "e","E":
                   this.contadorE+=1;
                   break;
               case "i","I":
                   this.contadorI+=1;
                   break;
               case "o","O":
                   this.contadorO+=1;
                   break;
               case "u", "U":
                   this.contadorU+=1;
                   break;
               case" ":
                   this.contadorEspacios+=1;
                   break;
               default:
           }
       }
       this.contadorCaracteres= this.texto.length()-this.contadorEspacios;
       return "El texto ingresado tiene: \n" +"Numero de 'A': "+ this.contadorA +"\n"+
               "Numero de 'E': "+ this.contadorE+"\n"+"Numero de 'I': "+this.contadorI+"\n"+
               "Numero de 'O': "+this.contadorO+"\n"+"Numero de 'U': "+this.contadorU+ "\n"+
               "Numero de caracteres en total: "+this.contadorCaracteres;
   }

    /**
     * Metodo que imprime el texto concatenado de la informacion
     */
   public void mostrarTextoConInformacion(){
       String textoConInformacion = textoConInformacionDeContador();
       logger.info(textoConInformacion);
   }

}
