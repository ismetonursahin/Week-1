import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil ;

        System.out.print("Yıl giriniz : ");
        yil = input.nextInt();

        if(yil > 0){ // Yıl negatif (-) bir değer olamaz.
            if(yil % 400 == 0 && yil % 4 == 0){ // 4'ün katı ve 400'e kalansız bölünebilme kuralı
                System.out.println(yil + " Bir artık yıldır. ");
            }else{
                System.out.println(yil + " Bir artık yıl değildir. ");
            }
        }else{ // Negatif değer sonucu.
            System.out.println("Yıl Değeri Negatif Olamaz !");
        }

    }
}