package Temeller;

import java.util.Scanner;

public class ForDonguPratik2 {
    // static void yerine PUBLIC static void olmalı
    public static void main(String[] args) {

        /*Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/

        Scanner scanner = new Scanner(System.in);
        int sayi = 1;
        System.out.print("Bir Sayı Giriniz: ");
        sayi = scanner.nextInt();

        System.out.println("4'ün Kuvvetleri: ");
        for(int i = 1; i <= sayi; i *= 4){
            System.out.println(i);
        }

        System.out.println("5'in Kuvvetleri: ");
        for(int j = 1; j <= sayi; j *= 5){
            System.out.println(j);
        }
    }
}