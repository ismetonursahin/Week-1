// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        for(int i = 1 ; i <= 100 ; i++) {
              for (int j = 2 ; j <= i ; j++){
                  if(i % j == 0){
                      System.out.println(j +"asal değil");
                  }else {
                      System.out.println("asal");
                  }
              }
        }
    }
}