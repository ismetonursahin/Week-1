import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for(int i = 1; i<=number; i++){
            for (int j =1 ; j<=i-1 ; j++){
                System.out.print(" ");

            }

            int star = (number+1)-i;
            for(int k = 1 ; k <= (2*star)-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}