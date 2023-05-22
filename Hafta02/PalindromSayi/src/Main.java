public class Main {

    static boolean IsPalindrom(int number) {
        int temp = number , reverseNumber=0, lastNumber;
        while (temp!=0) {
            System.out.println("************************************" );

            System.out.println("Sayı: " + number);

            //Son basamak silindikten sonraki halini görmek için
            System.out.println("Kalan sayı: " + temp);

            //Sayının 10'a bölümünden kalan bize son basamağı verir
            lastNumber =  temp % 10;
            System.out.println("Son basamak: " + lastNumber);

            //Sayının tersi ile 10'u çarpıp sonra son basamağı eklersek yeni sayıyı elde ederiz
            reverseNumber = (reverseNumber * 10 ) + lastNumber;
            System.out.println("Yeni sayı: " + reverseNumber);

            //Kalan sayıya ulaşmak için en baştaki sayıyı 10'a bölmeliyiz
            temp /= 10;


            System.out.println("***************************************");

        }
        //if döngüsü
        if (number==reverseNumber) {
            System.out.println(number + " palindrom sayıdır.");
        } else {
            System.out.println(number + " palindrom sayı değildir.");

        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrom(3434324);

    }
}