/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emreödev1234;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class Emreödev1234 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        System.out.println("\n 3X3 dizinin elemanları giriniz : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n 2 Boyutlu matris : \n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
        int max = a[0][0];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        int min = a[0][0];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }

        System.out.println("En büyük eleman " + max + "ile en küçük eleman " + min + "arasındaki fark " + (max - min) + "dir");

        // TODO code application logic here
    }

}
