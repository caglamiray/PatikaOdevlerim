 public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Çağla", 10, 100 , 120, 0);
        Fighter f2 = new Fighter("Miray" , 20 , 86 ,85, 100);

        Match match = new Match(f1,f2, 100 , 85);
        match.run();

    }

}