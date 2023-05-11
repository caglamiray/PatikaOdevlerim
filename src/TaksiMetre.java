import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {

        int km, mintutar=20, acilisucret=10;
        double taksimetre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilometre bilgisini giriniz: ");
        km= input.nextInt();

        taksimetre = ((km*2.20)+10<20) ? 20 : (km*2.20)+10;

        System.out.println("Taksimetre= " + taksimetre);
    }
}
