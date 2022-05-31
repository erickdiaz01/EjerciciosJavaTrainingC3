package org.ejercicio16;

import java.util.ArrayList;

public class Persona {
    private String nombre ;
   private  int edad ;
    private String dni ;
   protected String sexo;
   private float peso;
    private float altura;
public Persona(){
    this.nombre="";
    this.edad=0;
    this.sexo="H";
    this.peso=0;
    this.altura=0;
    this.dni= generaDNI();

}
public Persona(String nombre, int edad, String sexo){
    this.nombre=nombre;
    this.edad=edad;
    this.sexo=sexo;
    this.dni=generaDNI();

}

    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
    final double imc = (this.peso/(Math.pow(this.altura,2)));
    if(imc<20){
        return -1;
    }else if(imc<25){
        return 0;
    }else{
        return 1;
    }
    }
    public boolean esMayorDeEdad(){
     Boolean mayorDeEdad;
    if(this.edad<18){
        mayorDeEdad=false;
            return mayorDeEdad;
        }else{
        mayorDeEdad=true;
            return mayorDeEdad;
        }
}
  public boolean comprobarSexo(char sexo){
   String sexoStr=  String.valueOf(sexo);
   boolean sexosIguales;
   if(sexoStr.equals(this.sexo)){
       sexosIguales=true;
       return sexosIguales;
   }else {
       this.sexo = "H";
       sexosIguales = false;
       return sexosIguales;
   }
  }

@Override
public String toString(){
String informacion = "Nombre: "+ this.nombre +"\n"+
        "Edad: "+this.edad+"\n"+
        "DNI: "+this.dni+"\n"+
        "Sexo:"+this.sexo+"\n"+
        "Peso: "+this.peso+"\n"+
        "Altura: "+ this.altura;
return informacion;
}

public String generaDNI(){
 String numeroDelDNI = generarNumeroDelDNI();
String letraDelDNI= generarLetraDelDNI(numeroDelDNI);
return numeroDelDNI+letraDelDNI;
}
public String generarNumeroDelDNI(){
    ArrayList<String> dniNumeros= new ArrayList<>();

    while (dniNumeros.size()<8){
        int numeroTemporal = (int) (Math.random()*9);
        dniNumeros.add(String.valueOf(numeroTemporal));

    }
    String hash = String.join("", dniNumeros);
    return hash;
}
public String generarLetraDelDNI(String numeroDNI){
    int numeroTemporal = Integer.parseInt(numeroDNI);
    int resudio = numeroTemporal % 23;
    String letra = "";
    switch (resudio){
        case 0:
            letra= "T";
            break;

        case 1:
            letra= "R";
            break;
        case 2:
            letra= "W";
            break;
        case 3:
            letra= "A";
            break;
        case 4:
            letra= "G";
            break;
        case 5:
            letra= "M";
            break;
        case 6:
            letra= "Y";
            break;
        case 7:
            letra= "F";
            break;
        case 8:
            letra= "P";
            break;
        case 9:
            letra= "D";
            break;
        case 10:
            letra= "X";
            break;
        case 11:
            letra= "B";
            break;
        case 12:
            letra= "N";
            break;
        case 13:
            letra= "J";
            break;
        case 14:
            letra= "Z";
            break;
        case 15:
            letra= "S";
            break;
        case 16:
            letra= "Q";
            break;
        case 17:
            letra= "V";
            break;
        case 18:
            letra= "H";
            break;
        case 19:
            letra= "L";
            break;
        case 20:
            letra= "C";
            break;
        case 21:
            letra= "K";
            break;
        case 22:
            letra= "E";
            break;
    }
    return letra;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
