package Temeller;

import java.util.Scanner;

public class YildizlarIleUcgen
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Yıldızlar ile üçgen yapımı
        System.out.println("Lütfen basamak sayısını giriniz: ");
        int n = scanner.nextInt();
        int l = 1;

        for(int i = 1; i<= n; i++){
            for(int k = 1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for (int j = 1;j<= (2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("While Döngüsü İle Yapımı: ");
       while(l<=n){
           int k = 1;
           while(k <= (n-l)){
               System.out.print(" ");
               k++;
           }
           int x = 1;
           while(x <= (2*l)-1){
               System.out.print("*");
               x++;
           }
           System.out.println();
           l++;
       }
       scanner.close();

    }
}
