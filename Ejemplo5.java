/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo5;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejemplo5 {

        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese un numero positivo para la posicion " + i);
            int valor = teclado.nextInt();
            numeros[i] = valor + i;
        }

        System.out.println("ARREGLO RESULTANTE");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}

