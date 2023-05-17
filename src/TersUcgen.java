import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();
        int i,j;

        for(i=1 ; i<=n ; i++) {
            for(j=n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
