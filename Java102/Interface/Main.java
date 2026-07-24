package Java102.Interface;

import java.util.Scanner;

public class Main
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the price");
        double price = scanner.nextDouble();

        System.out.println("Please enter the Card Number");
        String cardNo = scanner.next();

        System.out.println("Please enter the date");
        String date = scanner.next();

        System.out.println("Please enter the cvc");
        String cvc = scanner.next();

        System.out.println("Bank A ");
        System.out.println("Bank B ");
        System.out.println("Please select a Bank: ");
        int selectedBank = scanner.nextInt();

        switch (selectedBank){
            case 1 :
                ABankasi aPost = new ABankasi("Bank A ","1122334455","baran1234");
                aPost.connect();
                aPost.payment(price,cardNo,date,cvc);
                break;
            default:
                System.out.println("Please Select an correct Bank");
        }
    }
}
