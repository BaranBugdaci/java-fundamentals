package Temeller;

import java.util.Scanner;

public class ForDonguPratik
{
    public static void main(String[] args) {


        //Girilen sayının 3 ve 4 e tam bölünenen sayıların ortalamasını hesaplama
        int sayi;
        int adet = 0;
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 12 == 0) {
                toplam += i;
                adet++;

            }
        }
        if (adet > 0) {
            double ortalama = toplam / adet;
            System.out.println("Ortalamaları : " + ortalama);

        }
    }
}
