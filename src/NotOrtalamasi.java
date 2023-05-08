import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Değişkenleri oluşturuyorum
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımlıyorum
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alıyorum
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        //Not ortalamasını hesaplıyorum
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız: " + sonuc);

        //Sınıfı geçip geçmediğinin kontrolünü sağlıyorum
        String ortalama = (sonuc>=60) ? "Sınıfı geçti." : "Sınıfta kaldı.";
        System.out.println(ortalama);




    }
}
