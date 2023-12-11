import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r,perimeter,circleArea ;
        final double pi = 3.14;
        double a ;

        //Kullanıcıdan yarıçap ve istenilen dilimin açı değeri alınan kısım.
        System.out.print("Yarıçap uzunluğunu giriniz : ");
        r = input.nextDouble();
        System.out.print("Açı Değeri Giriniz : ");
        a = input.nextDouble();

        circleArea = pi * r*r;  //Dairenin alanının hesaplanması
        System.out.println("Dairenin Alanı : " + circleArea);


        perimeter = (pi * (r*r) * a) / 360; //Dairenin çevresi hesaplanması
        System.out.println("Dilimin Çevresi : " + perimeter);

    }
}