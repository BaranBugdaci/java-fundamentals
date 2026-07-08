import java.util.Scanner;

public class DongulerleATMProgrami
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String islemler =
                "1. İşlem: Bakiye Öğrenme\n" +
                "2.İşlem: Para Çekme: \n" +
                "3.İşlem: Para Yatırma \n" +
                "Çıkış için 'q' ya basınız";

        System.out.println(islemler);

        int bakiye = 1000;

        int paraCekme;
        int paraYatirma;

       while(true)
       {
           System.out.println("Yapacağınız işlemi seçiniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("q"))
           {
               System.out.println("Sistemden Çıkılıyor... ");
               break;
           }
            else if(islem.equals("1"))
            {
                System.out.println("Bakiyeniz: " + bakiye);

            }
            else if(islem.equals("2"))
            {
                System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                paraCekme = scanner.nextInt();
                scanner.nextLine();
                if(bakiye - paraCekme <0){
                    System.out.println("Yetersiz Bakiye...");
                }
                else
                {
                    bakiye -= paraCekme;
                    System.out.println("Bakiyeniz Güncellendi: " + bakiye);
                }

            }
            else if(islem.equals("3"))
            {
                System.out.println("Yatırmak istediğiniz Miktarı Giriniz: ");
                paraYatirma = scanner.nextInt();
                bakiye += paraYatirma;
                System.out.println("Bakiyeniz Güncellendi: " + bakiye);


            }
            else {
                System.out.println("Geçersiz İşlem....");
            }
       }

    }
}
