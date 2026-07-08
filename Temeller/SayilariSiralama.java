package Temeller;
import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;
public class SayilariSiralama
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz A: ");
        int a = scanner.nextInt();
        System.out.println("İkinci Sayıyı Giriniz B: ");
        int b = scanner.nextInt();
        System.out.println("Üçüncü Sayıyı Giriniz C: ");
        int c = scanner.nextInt();


        if((a > b) && (a > c)){
            if ( b > c)
                System.out.println("A > B > C");
            else
                System.out.println("A > C > B");
        }
        else if((b > a) && (b > c)){
            if ( a > c)
                System.out.println("B > A > C ");
            else
                System.out.println("B > C > A");
        }
        if((c > a) && (c > b)){
            if ( a > b)
                System.out.println("C > A > B");
            else
                System.out.println("C > B > A");
        }


    }


}
