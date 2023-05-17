import java.util.Scanner;

public class KombinasyonHesap {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("n değerini giriniz: ");
        int n = input.nextInt();

        System.out.println("r değerini giriniz: ");
        int r = input.nextInt();

        if(n<r){

            System.out.println("n sayısı r sayısından büyük olmalıdır. Lütfen n değerini tekrar giriniz.");
            n=input.nextInt();
            KombinasyonHesap(n,r);
        }else{
            KombinasyonHesap(n,r);
        }
    }

    private static void KombinasyonHesap(int n, int r) {

        int faktoriyel_1=1;
        int faktoriyel_2=1;
        int faktoriyel_3=1;
        int fark=n-r;

        for(int i=1;i<=n;i++){

            faktoriyel_1=faktoriyel_1*i;
        }
        System.out.println("n sayısının faktöriyeli : " + faktoriyel_1);

        for(int j=1;j<=r;j++){

            faktoriyel_2=faktoriyel_2*j;
        }
        System.out.println("r sayısının faktöriyeli : " + faktoriyel_2);

        for(int k=1;k<=fark;k++){

            faktoriyel_3=faktoriyel_3*k;
        }
        System.out.println("(n-r)'nin faktöriyeli : " + faktoriyel_3);

        int carpim=faktoriyel_2*faktoriyel_3;
        int kombinasyon=faktoriyel_1/carpim;

        System.out.println(n + " Sayısının " + r + "'li" + " kombinasyonu = " + kombinasyon);
    }



}
