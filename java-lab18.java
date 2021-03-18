package calisma1;

import java.util.Scanner;

public class java {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Para miktarini giriniz=: ");
        int sayi = scan.nextInt();
        int para = 0;
        while (sayi >= 5) {
            if (sayi >= 50) {
                sayi -= 50;
            } else if (sayi >= 20) {
                sayi -= 20;
            } else if (sayi >= 10) {
                sayi -= 10;
            } else if (sayi >= 5) {
                sayi -= 5;
            }
            para++;
        }
        if (sayi != 0) {
            System.out.println(para + " tane kağıt para verdim. " + sayi + "'tl nizi yedim :)");
        } else {
            System.out.println(para + " tane kağıt para verdim.");
        }
    }

}
