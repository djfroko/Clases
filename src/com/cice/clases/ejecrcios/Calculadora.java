package com.cice.clases.ejecrcios;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int a = sc.nextInt();

        System.out.println("Introduce el numero a sumar");


        int b = sc.nextInt();


        System.out.println("el resultado de la suma es " + (a + b));


    }


}

