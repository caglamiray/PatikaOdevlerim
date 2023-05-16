import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int km, age, flightType;
        double perKm = 0.10, totalPrice;

        System.out.print("Lütfen mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Lütfen uçuş tipinizi seçiniz(1=>Tek Yön, 2=>Gidiş-Dönüş): ");
        flightType = input.nextInt();

        if (age < 0 || km < 0)
            System.out.println("Hatalı değer girdiniz!");
        else {
            totalPrice=perKm*km;

            //yaşa göre indirimi uyguluyorum.
            if(age<=12)
                totalPrice*=0.5;
            else if(age>12 && age<=24)
                totalPrice*=0.9;
            else if(age>65)
                totalPrice*=0.7;

            //uçuş tipine göre indirim uyguluyorum.
            switch (flightType) {
                case 1:
                    System.out.println("Toplam Tutar = "+totalPrice+" TL");
                    break;
                case 2:
                    totalPrice= (totalPrice*0.8)*2;
                    System.out.println("Toplam Tutar = "+totalPrice+" TL");
                    break;
                default:
                    System.out.println("Hatalı değer girdiniz.");
            }
        }


    }
}