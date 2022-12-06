package variables;

public class Soru07 {
    //İki tamsayıyı değiştirmek için bir kod yazınız.

    public static void main(String[] args) {
        int x = 5;
        int y = 15;

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
