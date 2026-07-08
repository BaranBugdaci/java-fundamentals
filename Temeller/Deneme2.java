import java.util.Scanner;

public class Deneme2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String islemler =
                "1. = Toplama\n" +
                "2. = Çıkarma\n" +
                "3. = Bölme\n" +
                "4. = Çarpma";
        System.out.println(islemler);

        int islem = scanner.nextInt();

        switch(islem)
        {
            case 1://TOPLAMA İŞLEMİ
                System.out.println("Birinci sayı: ");
                int birinciSayi = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                int ikinciSayi = scanner.nextInt();

                System.out.println("Toplam: " + (birinciSayi + ikinciSayi));
                break;

            case 2://ÇIKARMA İŞLEMİ
                System.out.println("Birinci sayı: ");
                birinciSayi = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                ikinciSayi = scanner.nextInt();

                System.out.println("Çıkarma: " + (birinciSayi - ikinciSayi));
                break;

            case 3://BÖLME İŞLEMİ
                System.out.println("Birinci sayı: ");
                birinciSayi = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                ikinciSayi = scanner.nextInt();

                System.out.println("Bölme: " + (birinciSayi / ikinciSayi));
                break;

            case 4://ÇARPMA İŞLEMİ
                System.out.println("Birinci sayı: ");
                birinciSayi = scanner.nextInt();
                System.out.println("İkinci Sayı: ");
                ikinciSayi = scanner.nextInt();

                System.out.println("Bölme: " + (birinciSayi * ikinciSayi));
                break;

            default:
                System.out.println("Geçersiz Bir Seçenek Yazdınız: ");



        }






    }
}
