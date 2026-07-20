package Classes.Fabric;

public class Employee
{
    String name;
    int salary;
    int workHours;
    int hireYear;
    int currentYear = 2021;

    public Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax(){
        if(this.salary < 1000){
            return 0;
        }else{
            return (int) (this.salary * 0.03);
        }
    }

    public int bonus(){
        if (this.workHours <= 40){
            return 0;
        }else{
            return (this.workHours - 40) * 30;
        }
    }
    public int raiseSalary(){
       if (currentYear - this.hireYear < 10){
           return (int) (this.salary * 0.05);
       }
       else if(currentYear - this.hireYear > 9 && currentYear - this.hireYear < 20){
           return (int) (this.salary * 0.10);
       }
       else{
           return (int) (this.salary * 0.15);
       }
    }

    public void print(){
        System.out.println("________________________________________________");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Haftalık Çalışma Saati: " + this.workHours);
        System.out.println("İşe Başlama Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maaş Artışı: " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - this.tax() + this.bonus()));
        System.out.println("Toplam Maaş: " + (this.salary + this.raiseSalary() + this.bonus() - tax()));
    }

}
