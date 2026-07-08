package Temeller;

import java.util.Scanner;

public class HarmonikSayi
{
    static void main(String[] args) {


        //Harmonik Sayı Formülü = (1 + 1/2 + 1/3... + 1/n)

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double toplam = 0;
        for(int i = 1; i<=n;i++){
            toplam += (1.0/i);
        }
        System.out.println(toplam);
        scanner.close();
    }

}