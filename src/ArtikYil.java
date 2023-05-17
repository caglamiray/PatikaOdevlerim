import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Yıl: ");
        year= input.nextInt();

        if (year%400==0) {
            System.out.println(year +": Artık yıldır.");
        } else {
            System.out.println(year + ": Artık yıl değildir.");
        }


    }
}
