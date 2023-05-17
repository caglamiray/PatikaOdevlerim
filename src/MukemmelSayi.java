import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,i,counter=0;
        System.out.print("Bir sayı girin: ");
        n = input.nextInt();
        for(i=1; i<n; i++){
            if(n%i == 0){
                counter+=i;
            }
        }
        if (counter == n){
            System.out.print(+ n + " mükemmel sayıdır");
        }
        else{
            System.out.print( + n + " mükemmel sayı değildir. ");
        }
    }
}
