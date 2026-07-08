package Methods;

import java.util.Scanner;


public class  MethodOverloadingHesapMakinesi
{
    public static int toplama(int a,int b){
        return a + b;
    }
    public static int cikarma (int a , int b){
        return a - b;
    }
    public static int bolme(int a , int b){
        return a / b;
    }
    public static int carpma(int a , int b ){
        return a * b;
    }


    public static int toplama(int a,int b,int c){
        return a + b + c;
    }
    public static int cikarma (int a , int b,int c){
        return a - b - c;
    }
    public static int bolme(int a , int b,int c){
        return (a / b) / c;
    }
    public static int carpma(int a , int b,int c){
        return a * b * c;
    }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      String islemler = "Yapmak İstediğiniz işlemi Seçiniz\n: " +
              "1.Toplama\n" +
              "2.Çıkarma\n" +
              "3.Bölme\n" +
              "4.Çarpma\n";
       System.out.println(islemler);



       while(true) {
           System.out.println("Yapacağınız İşlemi Seçiniz:(Çıkış için 'q') ");
           String islem = scanner.nextLine();

           if(islem.equals("q")){
               System.out.println("Sistem Kapanıyor...");
               break;
           }

           if (islem.equals("1")) {
               System.out.println("Kaç Sayıyla işlem yapacaksınız: ");
               int kacSayi = scanner.nextInt();
               if (kacSayi == 2) {
                   System.out.println("Birinci sayıyı giriniz");
                   int birinciSayi = scanner.nextInt();
                   System.out.println("ikinci sayıyı giriniz");
                   int ikinciSayi = scanner.nextInt();
                   System.out.println(toplama(birinciSayi, ikinciSayi));

               } else if (kacSayi == 3) {
                   System.out.println("Birinci sayıyı giriniz");
                   int birinciSayi = scanner.nextInt();
                   System.out.println("ikinci sayıyı giriniz");
                   int ikinciSayi = scanner.nextInt();
                   System.out.println("üçüncü sayıyı giriniz");
                   int ucuncuSayi = scanner.nextInt();
                   System.out.println(toplama(birinciSayi, ikinciSayi, ucuncuSayi));

               }
           }

           if (islem.equals("2")) {
               System.out.println("Kaç Sayıyla işlem yapacaksınız: ");
               int kacSayi = scanner.nextInt();
               if (kacSayi == 2) {
                   System.out.println("Birinci sayıyı giriniz");
                   int birinciSayi = scanner.nextInt();
                   System.out.println("ikinci sayıyı giriniz");
                   int ikinciSayi = scanner.nextInt();
                   System.out.println(cikarma(birinciSayi, ikinciSayi));
               } else if (kacSayi == 3) {
                   int birinciSayi = scanner.nextInt();
                   int ikinciSayi = scanner.nextInt();
                   System.out.println("üçüncü sayıyı giriniz");
                   int ucuncuSayi = scanner.nextInt();
                   System.out.println(cikarma(birinciSayi, ikinciSayi, ucuncuSayi));
               }
           }

           if (islem.equals("3")) {
               System.out.println("Kaç Sayıyla işlem yapacaksınız: ");
               int kacSayi = scanner.nextInt();
               if (kacSayi == 2) {
                   System.out.println("Birinci sayıyı giriniz");
                   int birinciSayi = scanner.nextInt();
                   System.out.println("ikinci sayıyı giriniz");
                   int ikinciSayi = scanner.nextInt();
                   System.out.println(bolme(birinciSayi, ikinciSayi));
               } else if (kacSayi == 3) {
                   System.out.println("Birinci sayıyı giriniz");
                   int birinciSayi = scanner.nextInt();
                   System.out.println("ikinci sayıyı giriniz");
                   int ikinciSayi = scanner.nextInt();
                   System.out.println("üçüncü sayıyı giriniz");
                   int ucuncuSayi = scanner.nextInt();
                   System.out.println(bolme(birinciSayi, ikinciSayi, ucuncuSayi));
               }
           }
           if (islem.equals("4")) {
               System.out.println("Kaç Sayıyla işlem yapacaksınız: ");
               int kacSayi = scanner.nextInt();
               if (kacSayi == 2) {
                   System.out.println("Birinci sayıyı giriniz");
                   int birinciSayi = scanner.nextInt();
                   System.out.println("ikinci sayıyı giriniz");
                   int ikinciSayi = scanner.nextInt();
                   System.out.println(carpma(birinciSayi, ikinciSayi));
               } else if (kacSayi == 3) {
                   System.out.println("Birinci sayıyı giriniz");
                   int birinciSayi = scanner.nextInt();
                   System.out.println("ikinci sayıyı giriniz");
                   int ikinciSayi = scanner.nextInt();
                   System.out.println("üçüncü sayıyı giriniz");
                   int ucuncuSayi = scanner.nextInt();
                   System.out.println(carpma(birinciSayi, ikinciSayi, ucuncuSayi));
               }
           }
           else {
               System.out.println("Geçersiz Bir değer girdiniz...");
           }

       }


















    }

}
