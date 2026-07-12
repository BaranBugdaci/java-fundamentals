package Arrays;

import java.util.Arrays;

public class DiziMaxVeMinDegeriBulma
{
    static void main(String[] args) {
        /*
        int maxValue = 0;
        int minValue = 0;

        for(int i : list){
            if(i > maxValue){
                maxValue = i;
            }
            if (i < minValue){
                minValue = i;
            }
        }
        System.out.println("Max değer: " + maxValue);
        System.out.println("Min değer: " + minValue);

         */
        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
        int[] list = {85,47,-98,42,5,8,23,-66,15,1,7};
        int theNumber = 6;
        int theClosestMax = Integer.MAX_VALUE;
        int theClosestMin = Integer.MIN_VALUE;

        Arrays.sort(list);

        for(int i : list ){
            if(i < theNumber){
                theClosestMin = i;

            } else if (i > theNumber) {
                theClosestMax = i;
            }
        }
        System.out.println(theClosestMin);
        System.out.println(theClosestMax);

    }
}
