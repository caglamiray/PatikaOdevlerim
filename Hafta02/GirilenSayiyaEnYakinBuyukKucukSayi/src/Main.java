import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.print("Girilen sayı: ");
       int n=input.nextInt();

        int nearestSmall = 0;
        int nearestBig = 0;

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);

        for(int i=0; i< list.length; i++) {
            if(n<list[i]) {
                nearestBig=list[i];
                nearestSmall=list[i-1];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestSmall);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestBig);



    }
}