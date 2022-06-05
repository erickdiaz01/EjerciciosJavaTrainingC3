package org.ejercicio16;

import java.util.ArrayList;
import java.util.Scanner;

public class AppEjercicio16 {
    protected static final Scanner scanner = new Scanner(System.in);
    static final org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("logger");

    /**
     * En este método principal se instacia 3 objetos de la clase Persona donde se solicita la información relacionada
     * con el nombre, la edad, el sexo, el peso y la altura para mostrar el indicador
     * que dice si se encuentran en un peso ideal
     * @param args
     */
    public static void main(String[] args){

        logger.info("Ingrese la informacion solicitada: ");
        logger.info("Nombre: ");
        String nombre = scanner.nextLine();
        logger.info("Edad: ");
        int edad = scanner.nextInt();
        scanner.skip("\n");
        logger.info("Sexo: ");
        String sexo = scanner.nextLine();
        logger.info("Peso: ");
        String pesoStr =scanner.nextLine();
        pesoStr=pesoStr.replace(",",".");
        float peso = Float.parseFloat(pesoStr);
        logger.info("Altura: ");
        String alturaStr =scanner.nextLine();
        alturaStr=alturaStr.replace(",",".");
        float altura = Float.parseFloat(alturaStr);
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Diana Cuervo");
        persona3.setAltura(1.59f);
        persona3.setEdad(22);
        persona3.setSexo("M");
        persona3.setPeso(56f);
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        for(int i=0;i<listaPersonas.size();i++){
            Persona personaTemporal= listaPersonas.get(i);
           int icm =personaTemporal.calcularIMC();
            final String laPersona ="La persona";
           switch (icm){

               case -1:
                   logger.info(laPersona+(i+1)+" esta por debajo del peso ideal");
                   break;
               case 0:
                   logger.info(laPersona+(i+1)+" esta en su peso ideal");
                   break;
               case 1:
                   logger.info(laPersona+(i+1)+" esta por encima de su peso ideal");
                   break;
               default:
                   logger.warn("error");

           }
           if(Boolean.TRUE.equals(personaTemporal.esMayorDeEdad())){
               logger.info("La persona "+(i+1)+" es mayor de edad");
           }else{
               logger.info("La persona "+(i+1)+" NO es mayor de edad");

           }
           logger.info(personaTemporal.toString());

        }

    }
}
