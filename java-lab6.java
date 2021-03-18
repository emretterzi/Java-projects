// Emre Terzi 180201087
public class Islemlerim {

    public double deger_1;

    /**
     * Constructor
     *
     * @param deger_1 işlem için birinci değer
     */
    public Islemlerim(double deger_1) {
        this.deger_1 = deger_1;
    }

    /**
     * Toplama işlemi
     *
     * @param deger_2 ikinci değer
     * @return toplama işleminin sonucu
     */
    public double topla(double deger_2) {
        double result = deger_1 + deger_2;
        return result;
    }

    /**
     * Çıkarma işlemi
     *
     * @param deger_2 ikinci değer
     * @return çıkarma işleminin sonucu
     */
    public double cikar(double deger_2) {
        double result = deger_1 - deger_2;
        return result;
    }

    /**
     * Çarpma işlemi
     *
     * @param deger_2 ikinci değer
     * @return çarpma işleminin sonucu
     */
    public double carp(double deger_2) {
        double result = deger_1 * deger_2;
        return result;
    }

    /**
     * Bölme işlemi
     *
     * @param deger_2 ikinci değer
     * @return bölme işleminin sonucu
     */
    public double bol(double deger_2) {
        double result = deger_1 / deger_2;
        return result;
    }

    /**
     * Buyuktur işlemi
     *
     * @param deger_2 ikinci değer
     * @return buyuktur işleminin sonucu
     */
    public boolean buyukdur(double deger_2) {
        boolean result = deger_1 > deger_2;
        return result;
    }

    /**
     * Kucuktur işlemi
     *
     * @param deger_2 ikinci değer
     * @return kucuktur işleminin sonucu
     */
    public boolean kucuktur(double deger_2) {
        boolean result = deger_1 < deger_2;
        return result;
    }

    /**
     * Esittir işlemi
     *
     * @param deger_2 ikinci değer
     * @return esittir işleminin sonucu
     */
    public boolean esittir(double deger_2) {
        boolean result = deger_1 == deger_2;
        return result;
    }
}
