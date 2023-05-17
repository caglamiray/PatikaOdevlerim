import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n1=0,n2=1,n3,i,n;
        System.out.print("N Sayısını Girin:");
        n = reader.nextInt();
        System.out.print(n1+" "+n2);//0 ve 1 yazdır

        for(i=2;i<n;++i) //Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}
