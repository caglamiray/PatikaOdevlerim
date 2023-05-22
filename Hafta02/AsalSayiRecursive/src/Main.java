import java.util.Scanner;
public class Main {

   static boolean isPrime (int number, int divider) {

       //2'den küçük sayılar asal değildir
       if (number<2) {
           return false;
       }
       if (number==2) { //2 asaldır
           return true;
       }
       if (number % divider == 0) { //Sayı bölünebiliyorsa asal değildir
           return false;
       }
       if (divider > Math.sqrt(number)) {
           return true;
       }
       return isPrime (number, divider+1);
   }

      //inputlar
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        if (isPrime(number,2)) {
            System.out.println(number+ " asal bir sayıdır.");
        } else {
            System.out.println(number+ " asal bir sayı değildir.");
        }


    }
    }
