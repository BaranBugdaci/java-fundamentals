package Methods;

import java.util.Scanner;

public class GelismisHesapMakinesi
{
    static int toplama(){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Toplamak İstediğiniz Sayıları Giriniz: ");
        System.out.println("Çıkmak için 0'ı Tuşlayın");
        int i =1;
        while(true){
            System.out.print(i++ + " .sayı ");
            int number = scanner.nextInt();
            if(number == 0)
                break;
            result +=number;


        }
        return result;
    }

    static int cikarma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çıkarmak İstediğiniz Sayıları Giriniz: ");
        System.out.println("Çıkmak için 0'ı tuşlayın");
        int result = 0;
        boolean isFirst = true;
        int i =1;
        while(true){
            System.out.print(i++ + " .sayı ");
            int number = scanner.nextInt();
            if(number == 0)
                break;
            if(isFirst){
                result = number;
                isFirst = false;
            }else {
                result -= number;
            }

        }
        return result;
    }
    static int carpma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çarpmak İstediğiniz Sayıları Giriniz: ");
        System.out.println("Çıkmak İçin 1'i Tuşlayın");
        int result = 1;
        int i = 1;
        while(true){
            System.out.print(i++ + " .sayı ");
            int number = scanner.nextInt();
            if(number == 1)
                break;
            if(number == 0){
                result = 0;
                break;
            }
            result *= number;

        }
        return result;
    }

    static int bolme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bölmek İstediğiniz Sayıları Giriniz: ");
        System.out.println("Çıkmak için -999 tuşlayınız");
        int result = 1;
        int i = 1;
        boolean isFirst = true;
        while (true){
            System.out.print(i++ + " .sayı ");
            int number = scanner.nextInt();
            if(number == -999)
                break;
            if (isFirst){
                result = number;
                isFirst = false;
            }else{

                result /= number;
            }
        }
        return result;
    }
    static int usAlma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üs almak İstediğiniz Sayıyı Giriniz: ");
        int result = 1;
            System.out.println("Sayi");
            int number = scanner.nextInt();
            System.out.println("üs");
            int us = scanner.nextInt();
            for(int i = 1; i<=us;i++){
                result *=number;
            }
        return result;
    }

    static int faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyelini almak istediğiniz sayıyı Giriniz: ");

        int result = 1;
            int number = scanner.nextInt();
            for(int i =1;i<=number;i++){
                result *=i;
            }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mesaj = "1.Toplama\n" +
                "2.Çıkarma\n" +
                "3.Çarpma\n" +
                "4.Bölme\n" +
                "5.Üs alma\n" +
                "6.Faktoriyel Alma" +
                "0: Programı kapat";
        System.out.println(mesaj);
        int select = scanner.nextInt();

        do {
            System.out.println(mesaj);
            select = scanner.nextInt();

            switch (select){
                case 1:
                    System.out.println(toplama());
                    break;
                case 2:
                    System.out.println(cikarma());
                    break;
                case 3:
                    System.out.println(carpma());
                    break;
                case 4:
                    System.out.println(bolme());
                    break;
                case 5:
                    System.out.println(usAlma());
                    break;
                case 6:
                    System.out.println(faktoriyel());
                    break;
                case 0:
                    System.out.println("Çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir İşlem Yaptınız...");
                    break;
            }

        } while (select != 0);  // 0 girilince döngü durur


    }
}
