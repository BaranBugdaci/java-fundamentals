package Methods;
public class PolindromSayi
{
    static boolean isPolindrom(int number){
        int temp = number;
        int lastNumber;
        int reverseNumber = 0;

        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10 ) + lastNumber;
            temp /= 10;
        }
        if(reverseNumber == number)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPolindrom(9889));
    }
}
