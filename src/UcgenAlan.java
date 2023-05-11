import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        int dikkenar1, dikkenar2;
        double hipotenus, alan;

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci dik kenarı giriniz: ");
        dikkenar1 = input.nextInt();
        System.out.println("İkinci dik kenarı giriniz: ");
        dikkenar2 = input.nextInt();
        System.out.println("Hipotenüsü giriniz: ");
        hipotenus = input.nextInt();

        alan = (dikkenar1*dikkenar2)/2;
        System.out.println("Alan= " + alan);


    }
}
