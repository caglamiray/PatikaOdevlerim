import com.sun.source.tree.BreakTree;

public class Employee {
    //Nitelikler
    String name;
    int salary;
    int workHours;
    int hireYear;
    double newSalary;
    int bonus;


    //Kurucu Metot
    Employee(String name, int salary, int workHours,int hireYear) {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    //Maaşa uygulanan vergiyi hesaplıyoruz.
    void tax(){
        if (this.salary<=1000) {
            System.out.println("Vergi uygulanmayacaktır.");
        } else {
            newSalary= this.salary-(this.salary*0.3);
        }

    }
    //Fazla çalışma saatine göre bonusu hesaplıyoruz.
    void bonus() {
        if (this.workHours>40) {
            int newworkHours = this.workHours;
            int shift = newworkHours - 40;
            bonus = shift*30;
        }
    }

    //Maaş artışını hesaplıyoruz.
    double raiseSalary() {
        double raisedSalary=0;
        if ((2021 - this.hireYear) < 10) {
            raisedSalary += (this.salary) * 0.05;
        } else if ((2021 - this.hireYear) >= 10 && (2021 - this.hireYear) < 20) {
            raisedSalary += (this.salary) * 0.10;
        } else {
            raisedSalary += (this.salary) * 0.15;
        }
        return raisedSalary;
    }
    //Ekrana yazdırıyoruz.
    public String toString(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaş: " +this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Yeni maaş: " + newSalary);
        System.out.println("Bonus:" + bonus);
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Toplam maaş: " + (newSalary+bonus+raiseSalary()));
        return null;
    }
}
