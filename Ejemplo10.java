/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo10;

import java.util.Scanner;

/**
 *
 * @author Brithany Juleixy Carrion Peralta
 */
public class Ejemplo10 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingrese el numero para la Fila " + (i + 1) + ", Columna " + (j + 1));
                int valor = teclado.nextInt();
                matriz[i][j] = valor + ((i + 1) * (j + 1));
            }
        }

        System.out.println("MATRIZ RESULTANTE");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
