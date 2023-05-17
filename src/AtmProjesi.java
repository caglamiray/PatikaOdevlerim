import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {

        String userName, pass;
        int right =3;
        int balance = 2500;
        int select;

        Scanner input = new Scanner(System.in);

        while (right>0) {

            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();

            System.out.print("Şifrenizi giriniz: ");
            pass = input.nextLine();

            if (userName.equals("patika") && pass.equals("dev123")) {
                System.out.println("Giriş başarılı. Kodluyoruz bankasına hoşgeldiniz.");

                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Çıkış");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutar: ");
                            int yatirilan = input.nextInt();
                            balance += yatirilan;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz tutar: ");
                            int cekilen = input.nextInt();
                            if (cekilen > balance) {
                                System.out.println("Yetersiz bakiye.");
                            } else {
                                balance -= cekilen;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yaptınız.");
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız.");
                            break;
                    }
                } while (select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı.");


                if (right==0) {
                    System.out.println("Kartınız bloke edilmiştir. Lütfen bankanız ile görüşünüz.");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }

    }
}
