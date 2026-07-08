import java.util.Scanner;

public class ArmstrongSayi {
     public static void main(String[] args) {
         /* Armstrong Sayı:
         1234 = 1^4 + 2^4 + 3^4 + 4^4
         do while
          */
         Scanner scanner = new Scanner(System.in);
         System.out.println("Bir sayı giriniz: ");
         int sayi = scanner.nextInt();
         System.out.println("Basamak Sayısı giriniz");
         int basamakSayisi = scanner.nextInt();
         int geciciSayi = sayi;
         int toplam = 0;
         do {
          int basamakDegeri = geciciSayi %10;
          geciciSayi /=10;
          toplam += Math.pow(basamakDegeri,basamakSayisi);
         }while(geciciSayi>0);

         if(sayi == toplam) {
             System.out.println("Bu sayı Armstrong sayısıdır..");
         }
         else{
             System.out.println("Bu sayı bir Armstrıng sayısı değildir...");
         }


     }
}
