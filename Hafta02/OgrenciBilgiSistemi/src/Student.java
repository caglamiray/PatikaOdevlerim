public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    double savarage;
    boolean isPass;

    double historyave;
    double physave;
    double bioave;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.savarage=0.0;
        this.isPass=false;
    }

    void adBulExamNote(int note1, int note2, int note3) {
        if (note1>=0 && note1<=100) {
            this.c1.note= note1;
        }
        if (note2>=0 && note2<=100) {
            this.c2.note= note2;
        }
        if (note3>=0 && note3<=100) {
            this.c3.note= note3;
        }

    }
    void  adBulSNote (int snote1, int snote2, int snote3) {
        if(snote1>=0 && snote1<=100){
            this.c1.snote=snote1;
        }
        if(snote2>=0 && snote2<=100){
            this.c2.snote=snote2;
        }
        if(snote3>=0 && snote3<=100){
            this.c3.snote=snote3;
        }
    }
    void isPass() {
        System.out.println("***************************************");
        historyave = (this.c1.note*0.80) + (this.c1.snote*0.20);
        System.out.println("Tarih ortalamanız: " + historyave);
        physave = (this.c2.note*0.80) + (this.c2.snote*0.20);
        System.out.println("Fizik ortalamanız: " + physave);
        bioave = (this.c3.note*0.80) + (this.c3.snote*0.20);
        System.out.println("Biyoloji ortalamanız: " + bioave);

        double result = (historyave+physave+bioave) / 3;
        System.out.println("Genel ortalamanız: " + result);

        if (result>=55) {
            System.out.println("Sınıfı geçtiniz.");
            this.isPass=true;
        } else {
            System.out.println("Sınıfta kaldınız.");
            this.isPass=false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu: " + this.c1.note);
        System.out.println(this.c2.name + " Notu: " + this.c2.note);
        System.out.println(this.c3.name + " Notu: " + this.c3.note);
    }

    void printSnote() {
        System.out.println(this.c1.name + " Notu: " + this.c1.snote);
        System.out.println(this.c2.name + " Notu: " + this.c2.snote);
        System.out.println(this.c3.name + " Notu: " + this.c3.snote);
    }
}

