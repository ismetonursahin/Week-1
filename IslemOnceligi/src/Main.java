import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c ;
        int total;

        System.out.print("A Sayısını Giriniz : ");
        a = input.nextInt();
        System.out.print("B Sayısını Giriniz : ");
        b = input.nextInt();
        System.out.print("C Sayısını Giriniz : ");
        c = input.nextInt();

        total  = a+b*c-b;
        System.out.println("işlem Sonucu : " + total);

    }
}