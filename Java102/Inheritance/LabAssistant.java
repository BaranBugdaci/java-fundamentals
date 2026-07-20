package Java102.Inheritance;

public class LabAssistant extends Assistant
{
    public LabAssistant(String nameSurname, String eMail, String phoneNo, String department, String degrees, String officeHours) {
        super(nameSurname, eMail, phoneNo, department, degrees, officeHours);
    }

    public void entryLab(){
        System.out.println(this.getNameSurname() + " Entered The Lab");
    }

}
