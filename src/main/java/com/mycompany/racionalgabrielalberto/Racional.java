package com.mycompany.racionalgabrielalberto;

import java.util.Random;

/**
 *
 * @author gabriel
 */
public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;

        if (denominador == 0) {
            this.denominador = 1;
            System.out.println("El denominador no es valido, se asigna el valor 1");

        } else {
            this.denominador = denominador;

        }
    }

    public void suma(Racional racional) {

        if (this.denominador == racional.denominador) {

            this.numerador += racional.numerador;

        } else {

            this.numerador = (this.numerador * racional.denominador)
                    + (this.denominador * racional.numerador);

            this.denominador *= racional.denominador;
        }

    }
    
    public void resta(Racional racional) {

        if (this.denominador == racional.denominador) {

            this.numerador -= racional.numerador;

        } else {

            this.numerador = (this.numerador * racional.denominador)
                    - (this.denominador * racional.numerador);

            this.denominador *= racional.denominador;
        }
        

    }
    
    public void producto(Racional racional){
        
        this.numerador *= racional.numerador;
        this.denominador *= racional.denominador;
    }

    public static Racional division(Racional racional1, Racional racional2){
        
        return new Racional(racional1.numerador *= racional2.denominador, racional1.denominador *= racional2.numerador);
    }
    
    public static boolean igualdad(Racional racional1, Racional racional2){
        boolean resultado;
        
        resultado = racional1.numerador * racional2.denominador 
                == racional1.denominador * racional2.numerador;
        
        return resultado;
    }
    
    public static Racional aleatorio(){
        Random varRandom = new Random();
        
        int numerador = varRandom.nextInt();
        int denominador = varRandom.nextInt();
        
        return new Racional();
    }
    
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            this.denominador = 1;
            System.out.println("El denominador no es valido, se asigna el valor 1");

        } else {
            this.denominador = denominador;

        }
    }

    public void imprimirConsola() {
        System.out.println("Número racional" + numerador + "/" + denominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

}
