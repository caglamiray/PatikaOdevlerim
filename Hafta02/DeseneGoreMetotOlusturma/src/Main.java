import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int number = input.nextInt();
        figure(number);
    }
    public static void figure(int number) {
        if (number<=0) {
            System.out.print(number + " ");
            return;
        } else {
            System.out.print(number + " ");
            number-=5;
            //Bu satıra geldiğinde fonksiyon geri dönüp çalışır ve
            // 0'dan düşük bir değer alana kadar aynı şekilde devam eder
            figure(number);
            //0'dan düşük bir değer aldıktan sonra(return olduktan sonra) bu satır çalışmaya başlar.
            number+=5;
            System.out.print(number + " ");
        }
    }
}