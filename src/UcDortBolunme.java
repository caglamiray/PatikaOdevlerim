import java.util.Scanner;
public class UcDortBolunme {
    public static void main(String[] args) {
        int n, ortakSayi=0, toplam=0;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n = input.nextInt();

        for (int i=0; i<=n; i++) {
            if (i%3==0 && i%4==0) {
                ortakSayi++;
                toplam+=i;
                System.out.println(i);
            }
        }
        ort=toplam/ortakSayi;
        System.out.println("Girdiğiniz sayıya kadar, 3'e ve 4'e bölünen ortak sayıların toplamı: " +toplam);
        System.out.println("Ortalama: " +ort);
    }
}
