import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, muzik, turkce, count = 0, sum = 0;

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat > 0 && mat < 100) {
            sum += mat;
            count++;
        }
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya > 0 && kimya < 100) {
            sum += kimya;
            count++;
        }
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik > 0 && muzik < 100) {
            sum += muzik;
            count++;
        }
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce > 0 && turkce < 100) {
            sum += turkce;
            count++;
        }
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik > 0 && fizik < 100) {
            sum += fizik;
            count++;
        }

        double average = sum / count;
        if (average > 55)
            System.out.println("Sınıfı geçtiniz.");
        else
            System.out.println("Sınıfta kaldınız.");

        System.out.println("Ortalamanız: " + average);

    }
}