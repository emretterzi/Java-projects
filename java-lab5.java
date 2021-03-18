// Emre Terzi 180201087

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Islemlerim hesap = new Islemlerim(15.0);

        System.out.println("Toplamı : " + hesap.topla(5));

        System.out.println("Farkı   : " + hesap.cikar(7));

        System.out.println("Çarpımı : " + hesap.carp(3));

        System.out.println("Bölümü  : " + hesap.bol(4));

        Scanner oku = new Scanner(System.in);
        System.out.print("Yarıçap Giriniz : ");
        int yariçap = oku.nextInt();
        Daire daire1 = new Daire(4);
        Daire daire2 = new Daire(yariçap);

        daire1.ekranaYazdir();
        daire2.ekranaYazdir();

        Faktoriyal faktoriyel = new Faktoriyal();
        faktoriyel.setDeger(4);
        faktoriyel.ekranaYazdir();

        faktoriyel.setDeger(6);
        faktoriyel.ekranaYazdir();

    }
}
