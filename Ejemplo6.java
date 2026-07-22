/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejemplo6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese el elemento [" + i + "][" + j + "]");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("MATRIZ INGRESADA");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

