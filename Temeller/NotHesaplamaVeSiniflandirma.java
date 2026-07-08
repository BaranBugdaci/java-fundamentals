import java.util.Scanner;

public class NotHesaplamaVeSiniflandirma
{
   public static void main(String[] args)
   {
       /*Vize 1 %30 Vize2 %30 Fİnal %40 */
       Scanner scanner = new Scanner(System.in);

       //Kullanıcıdan Alınan Girdiler
       System.out.println("1.Vizeden Aldığınız Puanı Giriniz: ");
       int vize1 = scanner.nextInt();

       System.out.println("2.Vizeden Aldığınız Puanı Giriniz: ");
       int vize2 = scanner.nextInt();

       System.out.println("Finalden Aldığınız Puanı Giriniz: ");
       int f1nal = scanner.nextInt();

       //Öğrencinin net notunun hesaplanması
       double sonuc = ((vize1 * 0.30) + (vize2 * 0.30) + (f1nal * 0.40));

       System.out.println("Sonuç: " + sonuc);

       //Aldığı Nota göre Sınıflandırma
       if (sonuc >= 90)
       {
           System.out.println("AA");
       } else if (sonuc >= 80)
       {
           System.out.println("BB");
       } else if (sonuc >= 70)
       {
           System.out.println("CC");
       } else if (sonuc >= 60)
       {
           System.out.println("DD");
       } else if (sonuc >= 50)
       {
           System.out.println("EE");
       } else
       {
           System.out.println("Kaldınız...");
       }

   }
}
