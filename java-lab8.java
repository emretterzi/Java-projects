/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emreödev12345;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class Emreödev12345 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sayi;
        double toplam = 0;

        for (int i = 0; i < i + 1; i++) {

            System.out.println("lütfen bir sayi giriniz çıkmak için 0 a basınız");
            sayi =sc.nextDouble();
                    
            toplam += sayi;
            if (sayi == 0) {
                System.out.println("sayiların ortalaması =" +(double)(toplam /(i)));
                break;

            }
                    

        }

        // TODO code application logic here
    }

}

 




