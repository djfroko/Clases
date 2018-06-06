package com.cice.clases.coches;

public class Coche {

    //atributos de la clase normalmente privados
    private String color;
    private int potencia;
    private String modelo;
    private String bastidor;
    private String marca;

    //metodos
    public void arrancar() {
        System.out.println("estoy arrancando....");
    }

    public void acelerar() {
        System.out.println("estoy acelerandoooooo..");
    }

    public void frenar() {
        System.out.println("estoy frenando...");
    }

    public void parar() {
        System.out.println("apagando motor...");
        System.out.println("motor parado..");
    }

    public void setPotencia(int potenciaDada) {
        if (potenciaDada > 0) {
            potencia = potenciaDada;
        }

    }
}
