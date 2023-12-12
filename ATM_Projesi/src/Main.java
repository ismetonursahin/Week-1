import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*******ATM******");
        int test = 3;
        int select ;
        int balance = 2000;
        String username,password ;


        while(test>0) {
            System.out.print("Kullanıcı Adı : ");
            username = input.nextLine();
            System.out.print("Şifre : ");
            password = input.nextLine();
            if (username.equals("ismetonursahin") && password.equals("1903")) {
                System.out.println("Değerli Müşterimiz Hoşgeldiniz");
                do {
                    System.out.println("  1-Para Çekme ");
                    System.out.println("  2-Para Yatırma ");
                    System.out.println("  3-Bakiye Sorgula ");
                    System.out.println("  4-Çıkış Yap ");
                    System.out.print("Hangi İşlemi Yapmak İstersiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Ne Kadar Para Çekmek İstiyorsunuz : ");
                            int price = input.nextInt();
                            if(balance<price){
                                System.out.println(" ***   YETERSİZ BAKİYE   *** ");
                            }else{
                                balance -= price;
                                System.out.println("Güncel Bakiye : " + balance);
                                System.out.println("Başka Bir İşlem Yapmak İstermisiniz ? ");
                            }
                            break;
                        case 2:
                            System.out.print("Ne Kadar Para Yatırmak İstiyorsunuz : ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Güncel Bakiye : " + balance);
                            System.out.println("Başka Bir İşlem Yapmak İstermisiniz ? ");
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz : " + balance);
                            System.out.println("Başka Bir İşlem Yapmak İstermisiniz ? ");
                            break;
                    }
                } while (select != 4);
                System.out.println("Çıkış Başarıyla Gerçekleşti. Tekrar Görüşmek Üzere");
                break;
            } else {
                test--;
                if (test == 0) {
                    System.out.println("3 Hatalı giriş Yaptınız. Hesabınız Bloke Olmuştur.");
                    System.out.println("Banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı İşlem, Kalan hakkınız : " + test);
                }
            }
        }
    }
}