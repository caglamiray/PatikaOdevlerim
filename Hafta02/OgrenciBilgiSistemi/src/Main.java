public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mehmet" , "1111" , "TRH");
        Teacher t2 = new Teacher("Selim", "2222", "FZK");
        Teacher t3 = new Teacher("Miray", "333", "BIO");

        Course history = new Course("Tarih", "101", "TRH");
        history.addTeacher(t1);

        Course physical = new Course("Fizik", "101", "FZK");
        physical.addTeacher(t2);

        Course biology = new Course("Biyoloji", "102" , "BIO");
        biology.addTeacher(t3);

        Student s1 = new Student("Çağla", "12", "4" , history,physical,biology);
        s1.adBulExamNote(45,100,56);
        s1.adBulSNote(100,90,80);
        s1.isPass();

        Student s2 = new Student("Ahmet" , "34", "4" , history,physical,biology);
        s2.adBulExamNote(89,56,87);
        s2.adBulSNote(90,46,89);
        s2.isPass();

    }
}