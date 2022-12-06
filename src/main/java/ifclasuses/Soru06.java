package ifclasuses;

public class Soru06 {
    /*
        Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.

 */
    public static void main(String[] args) {
        int sayi = -999;

        System.out.println((sayi > 99 && sayi < 1000) || (sayi < -99 && sayi > -1000) ?
                "Bu sayı 3 basamaklıdır " : "Bu sayı 3 basamaklı değildir");

    }

}
