package Classes.OBS;

public class Course
{
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int course1Quiz;
    int course2Quiz;
    int course3Quiz;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.course1Quiz = 0;
        this.course2Quiz = 0;
        this.course3Quiz = 0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else
            System.out.println("Öğretmen ve branş uyuşmuyor!");
    }
    void printTeacher(){
        System.out.println("===================================");
        System.out.println("Adı: " + teacher.name);
        System.out.println("mpno: " + teacher.mpno);
        System.out.println("branşı: " + teacher.branch);
    }
}
