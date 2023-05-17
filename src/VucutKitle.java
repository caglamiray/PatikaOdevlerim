import java.util.Scanner;
public class VucutKitle {
    public static void main(String[] args) {

        double boy,kilo,vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextInt();
        System.out.println("Boyunuzu giriniz(metre): ");
        boy = input.nextInt();

        vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
}
