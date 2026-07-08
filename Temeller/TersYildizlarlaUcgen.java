package Temeller;

import java.util.Scanner;

public class TersYildizlarlaUcgen
{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

       for(int i = n; i>= 1; i--){
            for(int k = 1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for (int j = 1;j<= (2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       System.out.println("__________________________________________________________________");
       System.out.println("While döngüsü ile yapımı: ");

       int i = n;
       while(i >=1){

           int k = 1;
           while (k<= (n-i)){
               System.out.print(" ");
               k++;
           }

           int j = 1;
           while(j <= (2* i)-1){
               System.out.print("*");
               j++;
           }
           System.out.println();
           i--;

       }
       scanner.close();
   }
}
