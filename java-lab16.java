package newpackage;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] arg) {

        Scanner tara = new Scanner(System.in);

        int birler, onlar, yuzler, binler;

        System.out.println("4 basamaklý bir sayý giriniz: ");

        int sayi = tara.nextInt();

        birler = sayi - ((sayi / 10) * 10);

        sayi = sayi / 10;

        onlar = sayi - ((sayi / 10) * 10);

        sayi = sayi / 10;

        yuzler = sayi - ((sayi / 10) * 10);

        sayi = sayi / 10;

        binler = sayi;

        System.out.println("Binler: " + binler + "\n" + "Yüzler: " + yuzler + "\n" + "Onlar: " + onlar + "\n" + "Birler: " + birler);

    }

}
