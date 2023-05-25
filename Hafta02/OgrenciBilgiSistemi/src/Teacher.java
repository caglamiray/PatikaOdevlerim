
public class Teacher {
    //Nitelikler
    String name;
    String mpno;
    String branch;

    //Constructor Metodu
    Teacher(String name, String mpno, String branch) {
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
        //Şimdi öğretmen sınıfımızı oluşturmuş olduk
    }
    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Tel no : " + this.mpno);
        System.out.println("Branş: " + this.branch);
    }
}

