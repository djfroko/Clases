package com.cice.clases.ejemplo;

public class Test {

    //los valores que se asignan por defecto si no lo inicializamos


    private int numeroEntero;//0
    private double nuermoReal;//0.0
    private boolean esCierto;//false
    private char caracter;// 
    private String nomnbre;//null

    @Override
    public String toString() {
        return "Test{" +
                "numeroEntero=" + numeroEntero +
                ", nuermoReal=" + nuermoReal +
                ", esCierto=" + esCierto +
                ", caracter=" + caracter +
                ", nomnbre='" + nomnbre + '\'' +
                '}';
    }
}


