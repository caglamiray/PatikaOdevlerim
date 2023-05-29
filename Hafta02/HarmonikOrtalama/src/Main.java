
public class Main {
    public static void main(String[] args) {
        int [] list = {1,2,3};
        double harmonicSeries=0.0;
        for (int i=0; i< list.length; i++) {
            harmonicSeries+=1/list[i];
        }
        double harmonicAverage= list.length/harmonicSeries;
        System.out.println(harmonicAverage);
    }
}