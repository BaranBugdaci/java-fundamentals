package Temeller;

import java.util.Scanner;

public class KombinasyonPratik
{
    public static void main(String[] args) {
       /* Java ile faktöriyel hesaplayan program yazıyoruz.
        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
        kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        Java ile kombinasyon hesaplayan program yazınız.
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("N elemanına bir sayı atayınız: ");
        int n = scanner.nextInt();
        System.out.println("R elemanına bir sayı atayınız: ");
        int r = scanner.nextInt();

        if (n >= r && n >= 0 && r >= 0) {
            //N elemanı faktoriyeli
            long faktoriyelN = 1;
            for (int i = 1; i <= n; i++) {
                faktoriyelN *= i;
            }
            System.out.println("N elemanının faktoriyeli: " + faktoriyelN);

            //R elemanı
            long faktoriyelR = 1;
            for (int j = 1; j <= r; j++) {
                faktoriyelR *= j;
            }
            System.out.println("R elemanının faktoriyeli: " + faktoriyelR);

            int nEksiRFonksiyon = n - r;
            long faktoriyelNEksiR = 1;
            for (int k = 1; k <= nEksiRFonksiyon; k++) {
                faktoriyelNEksiR *= k;
            }
            System.out.println("N-R elamanının faktoriyeli: " + faktoriyelNEksiR);


            long kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNEksiR);
            System.out.println("Kombinasyon: " + kombinasyon);

        }
        else{
            System.out.println("Yanlış bir işlem yaptınız lütfen tekrar deneyin...");
        }
        scanner.close();
    }
}