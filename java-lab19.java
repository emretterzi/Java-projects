package calisma1;

import java.util.Scanner;

public class java {

    public static void main(String[] arg) {

        String kullaniciadi ="emreyyy";
        String kullaniciparola ="emrey616161";

        Scanner scan = new Scanner(System.in);
        
        System.out.println("lütfen kullanıcı adi giriniz ");
        String ad = scan.nextLine();
        System.out.println("lütfen parolayi giriniz ");
        String parola = scan.nextLine();

        if ((kullaniciadi.equals(ad))&&kullaniciparola.equals(parola)) {
            System.out.println("sisteme girişiniz basarili olmustur");

        } else {
            System.out.println("tekrar deneyiniz");

        }
    }

}
