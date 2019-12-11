package com.mycompany.racionalgabrielalberto;

/**
 *
 * @author gabriel
 */
public class Racional {
    
    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador =1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        
        
        if (denominador == 0){
            this.denominador = 1;
            System.out.println("El denominador no es valido, se asigna el valor 1");
            
        }else{
            this.denominador = denominador;
            
        }
        
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    
    
    
    
    
}
