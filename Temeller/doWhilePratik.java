package Temeller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class doWhilePratik
{
    static void main(String[] args) {
        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
          4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/


        Scanner scanner = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.println("Bir sayı giriniz: ");
            sayi = scanner.nextInt();
            if(sayi % 4  == 0){
                toplam += sayi;

            }
        }while (sayi % 2 == 0);
        System.out.println("Toplam : " + toplam);
    }
}
