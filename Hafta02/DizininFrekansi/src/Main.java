
public class Main {
    public static void main(String[] args) {



                int[] list = {3, 3, 10, 26, 345, 10, 30, 26, 26};

                int count ;

                // Diziyi dolaşarak elemanları ve frekanslarını kontrol edelim

                for(int i = 0; i < list.length;  i++){
                    count = 0;
                    for(int j = 0; j < list.length; j++){
                        if(list[i] == list[j]){
                            count++;
                        }
                    }

                    // Frekansları yazdıralım

                    System.out.println(list[i] + " sayısı dizimizde " + count + " adet var.");

                }




    }
}