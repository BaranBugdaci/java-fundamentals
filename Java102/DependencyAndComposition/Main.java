package Java102.DependencyAndComposition;

public class Main
{
    public static void main(String[] args) {
        Student student1 = new Student("Baran","Buğdaci","CC",80);
        Student student2 = new Student("Burak","Eroğlu","AA",70);
        Student student3 = new Student("Selahattin","Anıl","BB",100);

        Instructor teacher = new Instructor("Efe Talha","Öksüz","History");

        Course mat = new Course("Matematik", "MAT", teacher);
        System.out.println(teacher.getName());

        Student[] students = {student1,student2,student3};

        mat.calcAvarage(students);
        System.out.println(mat.calcAvarage(students));
    }
}
