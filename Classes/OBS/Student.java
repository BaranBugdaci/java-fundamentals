package Classes.OBS;

public class Student
{
    Course course1;
    Course course2;
    Course course3;
    String name;
    String classes;
    int stuNo;
    int course1Quiz;
    int course2Quiz;
    int course3Quiz;
    double average;
    boolean isPass;

    Student(String name,int stuNo,String classes,Course course1,Course course2,Course course3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1,int note2,int note3,int course1Quiz,int course2Quiz,int course3Quiz){
        if(note1 >= 0 && note1 <= 100)
            course1.note = note1;
        if(note2 >= 0 && note2 <= 100)
            course2.note = note2;
        if(note3 >= 0 && note3 <= 100)
            course3.note = note3;
        if (course1Quiz >= 0 && course1Quiz <= 100)
            this.course1Quiz = course1Quiz;
        if (course2Quiz >= 0 && course2Quiz <= 100)
            this.course2Quiz = course2Quiz;
        if (course3Quiz >= 0 && course3Quiz <= 100)
            this.course3Quiz = course3Quiz;

    }


    void calcAverage(){
        this.average = (((course1Quiz * 0.20 ) + (course1.note* 0.80) + (course2Quiz * 0.20) + (course2.note * 0.80) + (course3Quiz * 0.20) + (course3.note * 0.80)) / 3 );

    }
    void isPass(){
        calcAverage();
        double course1Final = (course1Quiz * 0.20 ) + (course1.note * 0.80);
        double course2Final = (course2Quiz * 0.20 ) + (course2.note * 0.80);
        double course3Final = (course3Quiz * 0.20 ) + (course3.note * 0.80);
        if(course1Final >= 50 && course1Final <= 100 ){
            System.out.println("Öğrenci " + course1.name + " Dersini geçti");
        }else if(course1Final >= 0 && course1Final < 50){
            System.out.println("Öğrenci " + course1.name + " Dersini Geçemedi");
        }

        if(course2Final >= 50 && course2Final <= 100 ){
            System.out.println("Öğrenci " + course2.name + " Dersini geçti");
        }else if(course2Final >= 0 && course2Final < 50){
            System.out.println("Öğrenci " + course2.name + " Dersini Geçemedi");
        }

        if(course3Final >= 50 && course3Final<= 100 ){
            System.out.println("Öğrenci " + course3.name+ " Dersini geçti");
        }else if(course3Final >= 0 && course3Final < 50){
            System.out.println("Öğrenci " + course3.name + " Dersini Geçemedi");
        }

        if(average >= 50 && average <= 100){
            System.out.println("Bu öğrenci Sınıfı Geçti");
            this.isPass = true;

        }
        else{
            System.out.println("Bu öğrenci sınıfta kaldı");
            this.isPass = false;
        }
    }
    void printNote(){
        calcAverage();
        System.out.println("===================================");
        System.out.println("Adı: " + this.name);
        System.out.println("Öğrenci numarası: " + stuNo);
        System.out.println(course1.name + " Notu: " + course1.note);
        System.out.println(course2.name + " Notu: " + course2.note);
        System.out.println(course3.name + " Notu: " + course3.note);
        System.out.println(("Quiz notları: ")+  course1Quiz + "\n" + course2Quiz + ("\n") + course3Quiz);
        System.out.println("Ortalamanız: " + this.average);


    }



}
