import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş başarılı.");

        } else {
            System.out.print("Hatalı giriş yaptınız.");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = input.nextLine();

            switch (cevap) {
                case "evet":
                    System.out.print("Yeni Şifrenizi Giriniz:");
                    newPassword = input.nextLine();

                    if (newPassword.equals("java123")) {
                        System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                        break;
                    }
                case "hayır":
                    System.out.println("Tekrar Deneyiniz.");
                    break;
            }

        }


    }
}