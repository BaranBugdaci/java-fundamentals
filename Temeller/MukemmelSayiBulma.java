package Temeller;

import java.util.Scanner;

public class MukemmelSayiBulma
{
    /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır
*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        if(sayi <=0 ){
            System.out.println(sayi + " Sayısı Mükemmel Bir Sayı Değildir...");
            scanner.close();
            return;
        }
        for(int i = 1; i<sayi/2 ;i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        System.out.println();
        if(toplam == sayi){
            System.out.println( sayi + " Sayısı Mükemmel Bir Sayıdır");
        }
        else
            System.out.println(sayi + " Sayısı Mükemmel Bir Sayı Değildir...");

        scanner.close();
    }
}
