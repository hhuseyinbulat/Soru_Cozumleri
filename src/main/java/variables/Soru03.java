package variables;

public class Soru03 {
    //Basit faizi bulmak için bir kod yazınız.
    //Not: Basit faiz formülü = anapara * oran * yılDegeri /100
    public static void main(String[] args) {

        int anaPara=10000;
        double oran=12.5;
        int yil=2;
        double basitFaiz= anaPara*oran*yil/100;
        System.out.println(basitFaiz);
    }
}
