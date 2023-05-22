import java.util.Scanner;

public class Main {

    //herhangi bir sayının 0'ıncı kuvveti 1 old. için result'ı verdim
    //i'yi 1'den başlattım; i, 1'den küçük olduğu sürece i'yi 1 artırdım
    static int power(int a , int b) {
        int result = 1;
        for(int i = 1; i<=b; i++) {
            result *= a; // a kere çarpılacağı için
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        int b = input.nextInt();

        int result = power(a,b);
        System.out.println(a + "^" + b + " = " + result);
    }
}
