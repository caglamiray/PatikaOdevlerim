import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = (int) (Math.random()*100);

        Scanner input = new Scanner(System.in);

        int right = 0;
        int[] wrong= new int[5];
        boolean isWin=false;
        boolean isWrong= false;

        while (right<5) {
            System.out.print("Tahmin: ");
            int selected = input.nextInt();

            if (selected<0 || selected>99) {
                System.out.println("Tahmininiz 0 ile 100 arasında olmalıdır.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " +(5-right));
                } else {
                    isWrong= true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşecektir.");
                }
                continue;
            }
            if (number==selected){
                System.out.println("Kazandınız. Tahmin ettiğiniz sayı: " +number);
                isWin=true;
                break;
            } else {
                System.out.println("Yanlış tahmin.");
                if (number<selected) {
                    System.out.println(selected + " gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " gizli sayıdan küçüktür.");
                }
                wrong[right++]=selected;
                System.out.println("Kalan hakkınız: " + (5-right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz.");
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
    }
}