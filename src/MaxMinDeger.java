import java.util.Scanner;
public class MaxMinDeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N,max,min,num;

        System.out.print("Kaç tane sayı gireceksiniz?: ");
        N= input.nextInt();

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        num= input.nextInt();
        max = num;
        min = num;

        for (int i=2; i<=N; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz: ");
            num= input.nextInt();
            if (num>max) {
                max=num;
                System.out.println("En büyük sayı değişti.");
            } else if (num<min){
                System.out.println("En küçük sayı değişti");
            }
        }
        System.out.println("En büyük sayı = " + max);
        System.out.println("En küçük sayı = " + min);
    }
}
