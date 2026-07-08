package Temeller;

import java.util.Scanner;

public class UsluSayiAlmaPratik
{
    /*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
    Ödev
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("üssünü almak istediğiniz Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Üs kuvvetinin sayısını Giriniz: ");
        int uslu = scanner.nextInt();
        int sonuc = 1;


        for(int i = 0;i < uslu; i++){
            sonuc *= sayi;
        }
        System.out.println(sonuc);



    }
}
