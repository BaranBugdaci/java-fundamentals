import java.sql.SQLOutput;
import java.util.Scanner;

public class FaizUygulamasi
{
    public static void main(String[] args)
    {
        //Faiz Uygulaması oran %6 her yıl gelen paranın üstüne faiz binecek kaç yıl olduğunu kullanıcı seçecek

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faiz Oranı = %6\n");
        System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz: ");
        int anaPara = scanner.nextInt();
        System.out.println("Lütfen Kaç yılı vadeli yatırmak istiyorsunuz: ");
        int vade = scanner.nextInt();

        double toplamPara = anaPara;
        double  faizOrani = 0.06;

       for (int i=1; i<=vade;i++){
           toplamPara = (faizOrani * toplamPara) + toplamPara;


       }

        System.out.println("Faizden sonraki paranız: " + (int)toplamPara);




    }
}
