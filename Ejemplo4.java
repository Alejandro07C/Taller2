/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejemplo4 {

        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            numeros[i] = teclado.nextInt();

            if (numeros[i] % 2 == 0) {
                cantidadPares++;
                sumaPares += numeros[i];
            } else {
                cantidadImpares++;
                sumaImpares += numeros[i];
            }
        }

        System.out.println("Cantidad de pares: " + cantidadPares);
        System.out.println("Cantidad de impares: " + cantidadImpares);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
}

