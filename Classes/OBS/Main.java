package Classes.OBS;

public class Main
{
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Burak", "1141", "FZK");
        Teacher teacher2 = new Teacher("Ömer", "1111", "MAT");
        Teacher teacher3 = new Teacher("Aleyna", "1919", "ENG");

        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(teacher1);
        fizik.printTeacher();

        Course matematik= new Course("Matematik", "102", "MAT");
        matematik.addTeacher(teacher2);
        matematik.printTeacher();

        Course ingilizce = new Course("İngilizce","103","ENG");
        ingilizce.addTeacher(teacher3);
        ingilizce.printTeacher();


        Student student1 = new Student("Emir",1,"12-D",fizik,matematik,ingilizce);
        student1.addBulkExamNote(65,70,45,80,70,100);
        student1.printNote();
        student1.isPass();

        Student student2 = new Student("Selahattin", 2,"12-D",fizik,matematik,ingilizce);
        student2.addBulkExamNote(70,50,50,70,60,30);
        student2.printNote();
        student2.isPass();

        Student student3 = new Student("Efe TaLha",3,"12-E",fizik,matematik,ingilizce);
        student3.addBulkExamNote(60,90,100,50,80,80);
        student3.printNote();
        student3.isPass();


    }
}
