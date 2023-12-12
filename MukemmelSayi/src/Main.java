import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        int total = 0;
        System.out.println("Mükemmel Sayi Bulan Progam ");
        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        if(number > 0){
            for(int i = 1 ; i < number ; i++){
                if(number % i == 0){ // Kendisi hariç, pozitif bölenlerinin toplanması.
                    total += i;
                }
            }
            if(total == number){  //Pozitif tam bölenlerin toplamının karşılaştırılması
                System.out.println(number + " Mükemmel Sayıdır.");
            }else {
                System.out.println(number + " Mükemmel Sayı Değildir.");
            }
        }else{
            System.out.println("Negatif Mükemmel Sayı olamaz.");
        }
    }
}