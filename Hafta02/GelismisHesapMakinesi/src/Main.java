import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayı sıfıra bölünemez.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        return result;
    }

    static void calc(int a, int b) {
        System.out.println("Alan: " + (a * b));
        System.out.println("Çevresi: " + (2 * (a + b)));
    }


    public static void main(String[] args) {


        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış yap";

        Scanner input = new Scanner(System.in);


        while (true) {

            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("ilk sayı: ");
            int a = input.nextInt();
            System.out.print("İkinci sayı: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;

                case 4:
                    divided(a, b);
                    break;

                case 5:
                    System.out.println("Üs hesabı: " + power(a, b));
                    break;

                case 6:
                    System.out.println("Mod: " + mod(a, b));
                    break;

                case 7:
                    calc(a, b);
                    break;

                default:
                    System.out.println("Geçersiz bir işlem girdiniz.4");
            }
        }

    }
}