package Arrays;

import java.util.Arrays;

public class DizideTekrarEdenSayiBulma
{
   /* static boolean isFind(int[] arr,int value){
            for (int i : arr){
                if (value == i){
                    return true;
                }
            }
            return false;
    }

    public static void main(String[] args) {
        int[] list = {2,7,9,158,7,3,1,7,2,6,9,1,7};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if((i != j) && (list[i]== list[j])){
                    if(!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate){
            if(value !=0){
                System.out.print("  "+value);
            }
        }
    */

    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if(value == i){
                return true;
            }
        }
        return false;
    }

   public static void main(String[] args) {
       int[] list = {2,7,9,158,7,3,1,7,2,6,9,1,8};
       int[] ciftSayi = new int[list.length];
       int startIndex = 0;
       Arrays.sort(list);
       for (int i = 0; i < list.length;i++){
           if (list[i] % 2 == 0){
               if(!isFind(ciftSayi,list[i])){
                   ciftSayi[startIndex++] = list[i];
               }
           }
       }


       for (int value : ciftSayi){
           if(value !=0 ){
               System.out.print(" " + value);
           }
       }
   }

}
