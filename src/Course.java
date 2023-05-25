public class Course {
    //Nitelikler
    Teacher teacher; //Sınıflar birbirlerinin nitelikleri olabilir.Teacher sınıfından teacher adında bir nesne atadık
    String name;
    String code;
    String prefix;
    int note;
    int snote;

    Course(String name, String code, String prefix) {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        int snote=0;
    }
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher=teacher;
        }else{
            System.out.println("Öğretmen ve branş bilgisi uyuşmuyor");
        }
    }
    void printTeacher() {
        this.teacher.print();
    }
}
