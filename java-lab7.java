// Emre Terzi 180201087
public class Faktoriyal {

    private int deger;
    private int sonuc;

    /**
     * Faktoriyali bulunmak istenen değeri atar
     *
     * @param deger
     */
    public void setDeger(int deger) {
        this.deger = deger;
    }

    /**
     * Faktoriyali bulunmak istenen dönderir
     *
     * @return
     */
    public int getDeger() {
        return this.deger;
    }

    /**
     * Girilen değerin faktorial değerini Islemlerim class ındaki methodları
     * kullanarak hesaplayıp sonuc parametresine yazdırır
     */
    public void hesapla() {
        sonuc = 1;
        for (int i = 1; i <= this.deger; i++) {
            sonuc *= i;
        }
        System.out.println(" Faktoriyel : " + sonuc);
    }

    /**
     * Degeri ve sonucu ekrana yazdırır
     */
    public void ekranaYazdir() {
        hesapla();
    }

}
