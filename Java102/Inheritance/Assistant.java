package Java102.Inheritance;

public class Assistant extends Academician
{
    private String officeHours;

    public Assistant(String nameSurname, String eMail, String phoneNo, String department, String degrees,String officeHours) {
        super(nameSurname, eMail, phoneNo, department, degrees);
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void makeQuiz(){
        System.out.println(this.getNameSurname() + " Made a Quiz");
    }

    @Override
    public void entryLesson(String time){
        System.out.println(this.getNameSurname()  + " Entered in " + time);
    }
}
