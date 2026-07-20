package Java102.Inheritance;

public class SecurityOfficer extends Officer
{
    private String document;

    public SecurityOfficer(String nameSurname, String eMail, String phoneNo, String department, String shift,String document) {
        super(nameSurname, eMail, phoneNo, department, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void toBeOnGuard(){
        System.out.println(this.getNameSurname() + " To Be On Guard ");
    }
}
