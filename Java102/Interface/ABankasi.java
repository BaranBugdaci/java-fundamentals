package Java102.Interface;

public class ABankasi implements IBank
{
    private String bankName;
    private String terminalID;
    private String password;

   public ABankasi(String bankName, String terminalID,String password){
       this.bankName = bankName;
       this.terminalID = terminalID;
       this.password = password;
   }
   @Override
   public void connect(){
       System.out.println("The Bank's IP: "  + IBank.hostIp);
       System.out.println(this.bankName + " Connected ");
   }

    @Override
    public void payment(double price,String cardNo,String date,String cvc){
       System.out.println("Succsesfull");
   }

   public String getBankName(){
        return this.bankName;
   }

   public void setBankName(String bankName){
       this.bankName  = bankName;
   }

   public String getTerminalID(){
       return this.terminalID;
   }

   public void setTerminalID(String terminalID){
       this.terminalID = terminalID;
   }

   public String getPassword(){
        return this.password;
   }

   public void setPassword(String password){
       this.password = password;
   }
}
