package Arrays;

public class DiziHarmonikSayi
{
    public static void main(String[] args) {

        int[] array = {2,8,1,9,8,39,41,5,48,8};
        double toplam = 0;
        for(int i = 0; i < array.length;i++){
            toplam += (1.0/array[i]);
            System.out.println(toplam);
        }
        System.out.println(toplam);
    }
}
