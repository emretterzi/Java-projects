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
public class emreödev12345 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen 10 elemanlı diziyi giriniz");

        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("girilen dizi");

        for (int i = 0; i < 10; i++) {

            System.out.print(a[i]);
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (a[i] % 2 == 0) {
                b[i] = a[i];

            }

        }

        for (int i = 0; i < 10; i++) {

            if (a[i] % 2 == 1) {
                c[i] = a[i];

            }

        }
        System.out.println("çift sayilar");

        for (int i = 0; i < 10; i++) {

            if (b[i] != 0) {

                System.out.print(b[i]);

            }

        }
        System.out.println();
        System.out.println("tek sayilar");

        for (int i = 0; i < 10; i++) {

            if (c[i] != 0) {

                System.out.print(c[i]);

            }

        }

    }
}
