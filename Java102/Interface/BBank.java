package Java102.Interface;

public class BBank implements IBank
{
    private String bankName;
    private String terminalID;
    private String password;

    public BBank(String bankName, String terminalID, String password) {
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    public BBank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void connect() {
        System.out.println("The Bank Ip Adress: " + IBank.hostIp);
        System.out.println( this.bankName + "Connected");
    }

    @Override
    public void payment(double price, String cardNo, String date, String cvc) {
        System.out.println("Successful");
    }
}
