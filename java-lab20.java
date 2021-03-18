/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmreTerzi180201087;

/**
 *
 * @author Emre
 */
import java.util.Scanner
public class Main {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       //değişkenler
        String ad1,ad2,ad3;
                long sayi=1,sonuc;
                
                //çalışma1
                Scanner scn=new Scanner(System.in);
                System.out.println("Calisma1");
                System.out.println("Lütfen kisi adı giriniz");
                ad1=scn.nextLine();
                System.out.println("Lütfen kisi adi giriniz");
                ad2=scn.nextLine();
                System.out.println("Lütfen kisi adi giriniz");
                ad3=scn.nextLine();
                System.out.println("sonuc=;");
                System.out.println(ad1 + "\\" + ad2 +"\\" + ad3);
                System.out.println("----------------------------");
                //çalışma2
                        System.out.println("Calisma2");
                                for(int i=1;i<=10;i++)
                                {
                                sonuc=sayi*i;
                                sayi=sonuc;
                                }
                        
                        
                
                System.out.println(sayi);
                
               
            
              
                      
                
    }
    
    
    
    
    
}
