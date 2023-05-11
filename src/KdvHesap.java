import java.util.Scanner;
public class KdvHesap {
    public static void main(String[] args) {

        //Değişkenlerimi tanımlıyorum.
        double tutar, kdvTutar, kdvliTutar;

        //Scanner sınıfımızı tanımlıyorum.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan tutar bilgisi alıyorum.
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        double kdvOran = (tutar>=1000) ? 0.08 : 0.18;

       //Hesaplamaları yapıyorum.
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        //Ekrana yazdırıyorum.
        System.out.println("Kdvsiz Tutar: " + tutar);
        System.out.println("Kdv Oranı: " + kdvOran);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.println("Kdvli Tutar: " + kdvliTutar);




    }
}
