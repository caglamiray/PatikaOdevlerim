import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1,n2,buyukN;

        System.out.print("n1: ");
        n1 = input.nextInt();
        System.out.print("n2: ");
        n2 = input.nextInt();

        if (n1>n2) {
            buyukN = n1;
        } else {
            buyukN = n2;
        }
        int i = buyukN;
        int ebob=1, ekok=1;

        //ebob

        while (i>=1) {
            if(n1%i==0 && n2%i==0) {
                ebob=i;
                System.out.println("Ebob= "+ebob);
                break;
            }
            i--;
        }


        //ekok
        i=buyukN;

        while (i<(n1*n2)) {
            if(i%n1==0 && i%n2==0) {
                ekok=i;
                System.out.println("Ekok= "+ekok);
                break;
            }
            i++;
        }
    }
}
