public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Çağla" , 15000, 43, 2018);
        e1.tax();
        e1.bonus();
        e1.tax();
        e1.raiseSalary();
        e1.toString();

    }
}