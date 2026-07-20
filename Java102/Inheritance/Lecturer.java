package Java102.Inheritance;

public class Lecturer extends Academician
{
    private String doorNo;

    public Lecturer(String nameSurname, String eMail, String phoneNo, String department, String degrees,String doorNo) {
        super(nameSurname, eMail, phoneNo, department, degrees);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void senateMeeting(){
        System.out.println(this.getNameSurname() +  " Entered the Meeting");
    }

    public void makeTest(){
        System.out.println(this.getNameSurname() + " Made a Test");
    }
}
