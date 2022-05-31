package org.ejercicio16;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class AppEjercicio16 {
    protected static final Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger("org.ejercicio16");
    public static void main(String[] args){

        LOGGER.info("Ingrese la informacion solicitada: ");
        LOGGER.info("Nombre: ");
        String nombre = scanner.nextLine();
        LOGGER.info("Edad: ");
        int edad = scanner.nextInt();
        scanner.skip("\n");
        LOGGER.info("Sexo: ");
        String sexo = scanner.nextLine();
        LOGGER.info("Peso: ");
        String pesoStr =scanner.nextLine();
        pesoStr=pesoStr.replace(",",".");
        float peso = Float.parseFloat(pesoStr);
        LOGGER.info("Altura: ");
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
           switch (icm){
               case -1:
                   LOGGER.info("La persona "+(i+1)+" esta por debajo del peso ideal");
                   break;
               case 0:
                   LOGGER.info("La persona "+(i+1)+" esta en su peso ideal");
                   break;
               case 1:
                   LOGGER.info("La persona "+(i+1)+" esta por encima de su peso ideal");
                   break;

           }
           if(Boolean.TRUE.equals(personaTemporal.esMayorDeEdad())){
               LOGGER.info("La persona "+(i+1)+" es mayor de edad");
           }else{
               LOGGER.info("La persona "+(i+1)+" NO es mayor de edad");

           }
           LOGGER.info(personaTemporal.toString());

        }

    }
}
