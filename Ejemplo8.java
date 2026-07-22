/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo8;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejemplo8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese el elemento [" + i + "][" + j + "]");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("ELEMENTOS DE LA DIAGONAL PRINCIPAL");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i]);
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}

