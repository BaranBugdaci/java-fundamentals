package Java102.Inheritance;

public class Worker
{
    private String nameSurname;
    private String eMail;
    private String phoneNo;

    public Worker(String nameSurname,String eMail,String phoneNo){
        this.nameSurname = nameSurname;
        this.eMail = eMail;
        this.phoneNo = phoneNo;
    }

    public String getNameSurname(){
        return this.nameSurname;
    }

    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }

    public String getEMail(){
        return this.eMail;
    }

    public void setEMail(String eMail){
        this.eMail = eMail;
    }

    public String getPhoneNo(){
        return this.phoneNo;
    }

    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }

    public void entry(){
        System.out.println(this.nameSurname + " was entered the university.");
    }

    public void quit(){
        System.out.println(this.nameSurname + " exited the university.");
    }

    public void refectory(){
        System.out.println(this.nameSurname + " entered the refectory");
    }

}
