import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {

        int month, day;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Hangi ayda doğdunuz?: ");
        month = input.nextInt();
        System.out.print("Hangi günde doğdunuz?: ");
        day = input.nextInt();

        if (month == 1) {
            if(day>=1 && day<=31) {
                if (day<=21) {
                    System.out.println("Oğlak burcusunuz.");
                } else {
                    System.out.println("Kova burcusunuz.");
                }
            } else {
                isError= true;
            }
        }
        if (month == 2) {
            if(day>=1 && day<=31) {
                if (day<=19) {
                    System.out.println("Kova burcusunuz.");
                } else {
                    System.out.println("Balık burcusunuz.");
                }
            } else {
                isError= true;
            }
        }
        if (month == 3) {
            if(day>=1 && day<=31){
                if (day<=20) {
                    System.out.println("Balık burcusunuz.");
                } else {
                    System.out.println("Koç burcusunuz.");
                }
            } else {
                isError= true;
            }
        }
        if (month == 4) {
            if(day>=1 && day<=31){
                if (day<=20){
                    System.out.println("Koç burcusunuz.");
                } else {
                    System.out.println("Boğa burcusunuz.");
                }
            } else {
                isError= true;
            }
        }
        if (month == 5){
            if(day>=1 && day<=31){
                if (day<=21){
                    System.out.println("Boğa burcusunuz.");
                } else {
                    System.out.println("İkizler burcusunuz.");
                }
            } else {
                isError= true;
            }
        }
        if (month == 6){
            if(day>=1 && day<=31){
                if (day<=22) {
                    System.out.println("İkizler burcusunuz.");
                } else {
                    System.out.println("Yengeç burcusunuz.");
                }
            }else {
                isError=true;
            }
        }
        if (month == 7){
            if(day>=1 && day<=31){
                if (day<=22){
                    System.out.println("Yengeç burcusunuz.");
                }else{
                    System.out.println("Aslan burcusunuz.");
                }
            }else{
                isError= true;
            }
        }
        if (month == 8) {
            if(day>=1 && day<=31){
                if (day<=22){
                    System.out.println("Aslan burcusunuz.");
                }else{
                    System.out.println("Başak burcusunuz.");
                }
            }else {
                isError=true;
            }
        }
        if (month == 9){
            if(day>=1 && day<=31){
                if (day<=22){
                    System.out.println("Başak burcusunuz.");
                }else {
                    System.out.println("Terazi burcusunuz.");
                }
            }else {
                isError=true;
            }
        }
        if (month == 10){
            if(day>=1 && day<=31){
                if (day<=22){
                    System.out.println("Terazi burcusunuz.");
                }else {
                    System.out.println("Akrep burcusunuz.");
                }
            }else {
                isError=true;
            }
        }
        if (month == 11){
            if(day>=1 && day<=31){
                if (day<=21){
                    System.out.println("Akrep burcusunuz.");
                }else {
                    System.out.println("Yay burcusunuz.");
                }
            }else{
                isError=true;
            }
        }
        if (month == 12){
            if(day>=1 && day<=31){
                if (day<=21){
                    System.out.println("Yay burcusunuz.");
                }else {
                    System.out.println("Oğlak burcusunuz.");
                }
            }else {
                isError=true;
            }
        }
        if (isError){
            System.out.println("Hatalı giriş yaptınız.");
        }else{
            System.out.println("Burcunuzu öğrendiniz.");
        }
    }
}