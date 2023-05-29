import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //daha sonrasında count++ diyerek, kullanıcıdan aldığım numberları listeye atacağım için varsayılanı count=0 tanımladım
        int count=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();

        //n elemanlı boş bir liste oluşturdum
        int[] list = new int[n];


        //if döngüsü kullandım. kullanıcıdan aldığım dizinin boyutu(n), listenin eleman sayısına eşit olana kadar kullanıcıdan değer almaya devam ediyorum.
        for(int i=0; i< list.length; i++) {
            if (list[i]!=n) {
                System.out.print("Sayı giriniz: " );
                int number = input.nextInt();
                list[count++]=number;
            } else {
                break;
            }
        }

        //Listeyi sıralamak için:
        Arrays.sort(list);

        //Ekrana yazdırmak için:
        System.out.println("Sıralama : "+ Arrays.toString(list));


    }
}