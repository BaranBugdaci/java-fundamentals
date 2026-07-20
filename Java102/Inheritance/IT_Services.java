package Java102.Inheritance;

public class IT_Services extends Officer
{
    private String mission;

    public IT_Services(String nameSurname, String eMail, String phoneNo, String department, String shift,String  mission) {
        super(nameSurname, eMail, phoneNo, department, shift);
        this.mission = mission;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void networkSetup(){
        System.out.println(this.getNameSurname() +  " Started to setup network");
    }
}
