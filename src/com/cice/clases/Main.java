package com.cice.clases;

import com.cice.clases.coches.Coche;

public class Main {

    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.setPotencia(40);

        coche.arrancar();
        coche.acelerar();
        coche.frenar();
        coche.parar();



        Coche coche2 = new Coche();
        coche.setPotencia(50);
        Coche coche3 = new Coche();
        coche.setPotencia(90);

    }
}
