/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emreödev123;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class Emreödev123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String cumle1, cumle2;
        System.out.println("1.cümleyi giriniz=");
        cumle1 = scn.nextLine();

        System.out.println("2.cümleyi giriniz=");
        cumle2 = scn.nextLine();

        if (cumle1.length() == cumle2.length()) {

            for (int i = 0; i <= cumle1.length() - 1; i++) {
                if (cumle1.charAt(i) == cumle2.charAt(i)) {
                    System.out.println("iki cümle aynıdır");
                    break;
                } else {
                    System.out.println("iki cümle ayni değildir");
                }
                break;

            }
        } else {
            System.out.println("iki cümle ayni değildir");
        }

        System.out.println("1.cümlenin tersten yazılışı asağıdaki gibidir");

        int sonindex = cumle1.length() - 1;
        for (int i = 0; i <= sonindex; i++) {
            System.out.print(cumle1.charAt(sonindex - i));

        }

    }
    
}


