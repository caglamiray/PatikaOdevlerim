import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        heat = input.nextInt();

        if (heat <5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat>=5 && heat<=25) {
            if (heat>=5 && heat<10) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat>=10 && heat<15) {
                System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
            }
            if (heat>=15 && heat<25) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
