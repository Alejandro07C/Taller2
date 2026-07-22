/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo7;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejemplo7 {

   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int suma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese el elemento [" + i + "][" + j + "]");
                matriz[i][j] = teclado.nextInt();
                suma += matriz[i][j];
            }
        }

        System.out.println("Suma total de los elementos: " + suma);
    }
}

