
public class Main {

    static int fib(int n) {

        //fib(1) = fib(2) = 1 old. için n=1 ya da n=2 olduğunda 1 döndürmesini istiyorum.
        if (n==1 || n==2) {
            return 1;
        }

        //Fibonacci serisinin formülü => f(n) = f(n-1) + f(n-2)
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));


    }
}