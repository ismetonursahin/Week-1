import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        double b;

        //Kullanıcıdan tam sayı ondalıklı sayılar alıyoruz.
        System.out.print("Bir Tam Sayı Giriniz : ");
        a = input.nextInt();
        System.out.print("Bir Ondalıklı Sayı Giriniz (',' Kullanınız) : ");
        b = input.nextDouble();

        double doubleCast = a;
        int intCast = (int)b;

        System.out.println("Int to Double : "+doubleCast );
        System.out.println("Double to Int : "+intCast);

    }
}