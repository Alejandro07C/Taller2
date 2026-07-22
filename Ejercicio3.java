/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[15];
        int mayor;
        int menor;
        int posMayor = 0;
        int posMenor = 0;

        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            numeros[i] = teclado.nextInt();
        }

        mayor = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < 15; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("Numero mayor: " + mayor + " (posicion " + posMayor + ")");
        System.out.println("Numero menor: " + menor + " (posicion " + posMenor + ")");
    }
}

