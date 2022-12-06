package ifclasuses;

public class Soru02 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 5;

        // 1.YOL
        boolean ikizkenar = ((a==b) && (a!=c)) || ((b==c) && (c!=a)) || ((a==c)&&(a!=b));
        boolean eskenar = a==b && a==c;

        System.out.println(ikizkenar ? "ikizkenar" : (eskenar ? "Eşkenar" : "Ceşitkenar"));

        //2.YOL

        System.out.println((a == b) && (b == c) ? "eşkenar üçgen" : ((a == b) && (b!=c) ||
                (b == c) && (b!=a)  || (a == c) && (b!=c)? "ikizkenar üçgen" : "çeşitkenar üçgen"));



    }
}
