package Methods;

import java.util.Scanner;

public class RecursiveUsAlma
{
    static long usAlma(long taban,long us){
        if(us == 0){
            return 1;
        }
        return taban * usAlma(taban,us-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabanı Giriniz: ");
        long taban = scanner.nextLong();
        System.out.println("Üssü giriniz: ");
        long us = scanner.nextLong();

        System.out.println(usAlma(taban,us));
    }
}
