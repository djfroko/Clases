package com.cice.clases.ejecrcios;

//Crea una clase contador con los metodos para incrementar y decrementar el contador. getter y setter


public class Contador {

    private int cuenta;

    public void incrementar(int numero){
        cuenta+=numero;
    }

    public void decrementar(int numero){
        cuenta-=numero;
    }

    public void setCuenta(int numero) {
        cuenta = numero;
    }

    public int getCuenta(){
        return cuenta;
    }
}
