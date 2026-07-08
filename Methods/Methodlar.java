package Methods;

import java.util.Scanner;

public class Methodlar
{
    static double bolme(double a,double b){

        return (a/b);
    }

    static void cikarma(int a,int b,int c) {

        System.out.println("Çıkarma = " + (a-b-c));
    }

    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        long sayi = scanner.nextInt();
        long faktoriyel = 1;

        while(sayi>0){

            faktoriyel *=sayi;
            sayi--;
        }
        System.out.println("Faktoriyel = " + faktoriyel);

    }

    public static void main(String[] args) {

        cikarma(99,74,4);
        faktoriyel();

        System.out.println("Bölme: " + bolme(125288717,5));
    }
}
