import java.util.Scanner;

public class Deneme1
{
    public static void main(String[] args) {
     /*   //Girilen sayılardan maksimum sayıyı bulma

        Scanner scanner = new Scanner(System.in);
        System.out.println("3 tane farklı değerlerde sayı giriniz");
        int sayi0 = scanner.nextInt();
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int max = 0;

        if(sayi0 >= sayi1 && sayi0 >= sayi2)
        {
            max = sayi0;

            System.out.println("En büyük sayı: " + max);
        }

        else if(sayi1 >= sayi0 && sayi1 >= sayi2)
        {
            max = sayi1;
            System.out.println("En büyük sayı: " + max);
        }

        else if(sayi2 >= sayi0 && sayi2 >= sayi1)
        {
            max = sayi2;
            System.out.println("En büyük sayı: " + max);
        }
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz: ");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen Kilonuzu Kilogram Cinsinden Giriniz: ");
        double kilo = scanner.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz: " + vki);

        if(vki<18.5)
        {
            System.out.println("Zayıfsınız...");
        }
        else if (vki >= 18.5 && vki <= 25.0)
        {
            System.out.println("Normal Kilodasınız");
        }
        else if (vki >25  && vki <= 30.0)
        {
            System.out.println("Fazla Kilolusunuz!");
        }

        else if (vki>30)
        {
            System.out.println("Obez");

        }

        else
        {
            System.out.println("Geçersiz bir değer girdiniz1");
        }


    }
}
