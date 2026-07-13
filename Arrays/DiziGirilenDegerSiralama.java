package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class DiziGirilenDegerSiralama
{
  public  static void main(String[] args) {
      /*
      Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
       Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
       */
      Scanner scanner = new Scanner(System.in);

      System.out.println("Lütfen Dizinin Kaç Elemanlı Olacağını Yazınız: ");
      int arrayLength = scanner.nextInt();
      int[] list = new int[arrayLength];

      for (int i = 0; i <list.length; i++){
          System.out.print( (i+1) + ". Elamanı: ");
          list[i] = scanner.nextInt();
      }
      Arrays.sort(list);
      System.out.println(Arrays.toString(list));
    }
}
