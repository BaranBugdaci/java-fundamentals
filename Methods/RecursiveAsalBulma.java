package Methods;

import java.util.Scanner;

public class RecursiveAsalBulma
{
    static boolean asalMi(int sayi, int bolen) {
        if (bolen == sayi)
            return true;
        if (sayi % bolen == 0)
            return false;

        return asalMi(sayi, bolen + 1);
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Sayınızı Giriniz: ");
    int sayi = scanner.nextInt();

    if(asalMi(sayi,2)){
        System.out.println(sayi + " Asaldır");
    }
    else
        System.out.println( sayi + " Asal Değildir");

    }
}
