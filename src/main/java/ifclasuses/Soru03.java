package ifclasuses;

public class Soru03 {

    public static void main(String[] args) {
        // 1.YOL
        int sayi1 = 125;
        int sonuc =sayi1%10>=5 ? (sayi1/10+1)*10 : (sayi1/10)*10;
        System.out.println("sonuc = " + sonuc);


        //2.YOL
        int sayi =127;
        double sayi2=sayi/10;

        System.out.println(sayi % 10 >= 5 ? Math.ceil(sayi2) * 10 : Math.floor(sayi2) * 10);

        /*
            Math.ceil() --> Sayiyi kendinen büyük bir üst kademeye yuvarlar. Ondalıklı sayi ile calisir.
            Math.floor() --> Sayiyi kendinen kücük bir alt kademeye yuvarlar. Ondalıklı sayi ile calisir.
         */
    }

}
