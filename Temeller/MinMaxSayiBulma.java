package Temeller;

import java.util.Scanner;

public class MinMaxSayiBulma
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Tane Sayı girileceğini yazınız: ");
        int n = scanner.nextInt();
        System.out.println("Sayıları Giriniz: ");
        int ilkSayi = scanner.nextInt();

        int enBuyuk = ilkSayi;
        int enKucuk = ilkSayi;

        for(int i = 2; i<=n; i++){
            int girilenSayi = scanner.nextInt();

            if(girilenSayi > enBuyuk){
                enBuyuk = girilenSayi;

            }
            if (girilenSayi < enKucuk){
                enKucuk = girilenSayi;

            }
        }
        System.out.println(enBuyuk + " En Büyük");
        System.out.println(enKucuk + " En küçük");
    }
}
