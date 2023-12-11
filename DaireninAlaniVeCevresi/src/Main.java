import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,perimeter,circleArea ;
        double pi = 3.14;
        double a ;

        System.out.print("Yarıçap uzunluğunu giriniz : ");
        r = input.nextDouble();

        System.out.print("Açı Değeri Giriniz : ");
        a = input.nextDouble();

        circleArea = pi * r*r;
        System.out.println("Dairenin Alanı : " + circleArea);

        perimeter = (pi * (r*r) * a) / 360;
        System.out.println("Dilimin Çevresi : " + perimeter);
    }
}