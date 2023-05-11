import java.util.Scanner;
public class MnvKasa {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, tutar, armutkg,elmakg,domateskg,muzkg,patlicankg;

        Scanner input = new Scanner(System.in);

        armut =2.14;
        elma = 3.67;
        domates= 1.11;
        muz= 0.95;
        patlican = 5;

        System.out.print("Kaç kilo domates aldınız? ");
        domateskg = input.nextInt();
        System.out.println("Kaç kilo elma aldınız? ");
        elmakg = input.nextInt();
        System.out.println("Kaç kilo muz aldınız? ");
        muzkg = input.nextInt();
        System.out.println("Kaç kilo armut aldınız? ");
        armutkg = input.nextInt();
        System.out.println("Kaç kilo patlıcan aldınız? ");
        patlicankg= input.nextInt();

        tutar= (armutkg*armut)+(elmakg*elma)+(domateskg*domates)+(muzkg*muz)+(patlicankg*patlican);
        System.out.println("Toplam tutar: " + tutar);

    }
}

