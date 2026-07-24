package Java102.Inheritance;

public abstract class  Academician extends Worker
{
    private String department;
    private String degrees;
    public Academician(String nameSurname, String eMail, String phoneNo,String department,String degrees) {
        super(nameSurname, eMail, phoneNo);
        this.department = department;
        this.degrees = degrees;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDegrees(){
        return this.degrees;
    }

    public void setDegrees(String degrees){
        this.degrees = degrees;
    }

    public abstract void entryLesson(String theTime);



}



