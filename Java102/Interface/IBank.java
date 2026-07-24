package Java102.Interface;

public interface IBank
{
    public final String hostIp =  "127.0.0.1";

    void connect();
    void payment(double price,String cardNo,String date,String cvc);

}
