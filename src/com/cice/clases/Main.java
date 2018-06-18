package com.cice.clases;

import com.cice.clases.coches.Coche;
import com.cice.clases.ejemplo.ClaseEstatica;
import com.cice.clases.ejemplo.Test;

public class Main {

    public static void main(String[] args) {

       /* Coche coche = new Coche();
        coche.setPotencia(40);

        coche.arrancar();
        coche.acelerar();
        coche.frenar();
        coche.parar();



        Coche coche2 = new Coche();
        coche.setPotencia(50);
        Coche coche3 = new Coche();
        coche.setPotencia(90);*/



        /*Test test = new Test();
        System.out.print(test.toString());*/


        ClaseEstatica.nombreCompuesto("Gustavo", "Gamboa")
                ClaseEstatica estatica1 = new ClaseEstatica();
        estatica1.numeroEstatico = 10;

        ClaseEstatica estatica2 = new ClaseEstatica();

        //Pinto el valor de la variable estatica de nuevo objeto
        System.out.println(estatica2.numeroEstatico);


    }


}
