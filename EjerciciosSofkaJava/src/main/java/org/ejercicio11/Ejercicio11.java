package org.ejercicio11;

import java.util.Scanner;
import java.util.logging.Logger;


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
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio10");
   public Ejercicio11(){
this.contadorEspacios=0;
this.contadorE=0;
this.contadorU=0;
this.contadorCaracteres=0;
this.contadorA=0;
this.contadorI=0;
this.contadorO=0;
   };

   public void getTexto(){
       LOGGER.info("Ingrese el texto para saber su longitud y saber cuantas vocales tiene de cada una: ");
       this.texto= scanner.nextLine();
   }

   public String textoConInformacionDeContador(){
getTexto();

       for(int i=0; i<this.texto.length();++i){
           char c = this.texto.charAt (i);
           String letra = String.valueOf(c);
           switch (letra){
               case "a":case "A":
                   this.contadorA+=1;
                   break;
               case "e": case "E":
                   this.contadorE+=1;
                   break;
               case "i": case"I":
                   this.contadorI+=1;
                   break;
               case "o": case"O":
                   this.contadorO+=1;
                   break;
               case "u": case "U":
                   this.contadorU+=1;
                   break;
               case" ":
                   this.contadorEspacios+=1;
                   break;
           }
       }
       this.contadorCaracteres= this.texto.length()-this.contadorEspacios;
       return "El texto ingresado tiene: \n" +"Numero de 'A': "+ this.contadorA +"\n"+
               "Numero de 'E': "+ this.contadorE+"\n"+"Numero de 'I': "+this.contadorI+"\n"+
               "Numero de 'O': "+this.contadorO+"\n"+"Numero de 'U': "+this.contadorU+ "\n"+
               "Numero de caracteres en total: "+this.contadorCaracteres;
   }

   public void mostrarTextoConInformacion(){
       String textoConInformacion = textoConInformacionDeContador();
       LOGGER.info(textoConInformacion);
   }

}
