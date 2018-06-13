package com.cice.clases.ejecrcios;
//Crea una cuenta con los metodos de ingreso, reintegro y transferencia.
//metodos getter y setter


public class Cuenta {

    private double balance;

    public void ingreso(double cantidad){
        balance += cantidad;
    }

    public void reintegro(double cantidad){
        balance -= cantidad;
    }

    public void transferencia(double cantidad){
        balance -= cantidad;
    }

    public void setBalance(double cantidad){
        balance = cantidad;
    }

    public double getBalance() {
        return balance;
    }
}