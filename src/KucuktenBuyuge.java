import java.util.Scanner;
public class KucuktenBuyuge {
    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1.sayı: ");
        a = input.nextInt();
        System.out.print("2.sayı: ");
        b= input.nextInt();
        System.out.print("3.sayı: ");
        c = input.nextInt();

        if ((a<b) && (a<c)) {
            if (b<c) {
                System.out.println("a<b<c");
            }else{
                System.out.println("a<c<b");
            }
        } else if ((b<a) && (b<c)) {
            if (a<c) {
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }
        }else {
            if (b<a) {
                System.out.println("c<b<a");
            } else {
                System.out.println("c<a<b");
            }
        }
    }
}
