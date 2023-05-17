import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Doğum yılınız: ");
        year= input.nextInt();

        if (year%12==0) {
            System.out.println("Burç: Maymun");
        } else if (year%12==1) {
            System.out.println("Burç: Horoz");
        } else if (year%12==2) {
            System.out.println("Burç: Köpek");
        } else if (year%12==3) {
            System.out.println("Burç: Domuz");
        } else if (year%12==4) {
            System.out.println("Burç: Fare");
        } else if (year%12==5) {
            System.out.println("Burç: Öküz");
        } else if (year%12==6) {
            System.out.println("Burç: Kaplan");
        } else if (year%12==7) {
            System.out.println("Burç: Tavşan");
        } else if (year%12==8) {
            System.out.println("Burç: Ejderha");
        } else if (year%12==9) {
            System.out.println("Burç: Yılan");
        } else if (year%12==10) {
            System.out.println("Burç: At");
        } else if (year%12==11) {
            System.out.println("Burç: Koyun");
        }

    }
}
