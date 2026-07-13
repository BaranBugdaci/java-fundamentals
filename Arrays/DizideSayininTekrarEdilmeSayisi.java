package Arrays;

public class DizideSayininTekrarEdilmeSayisi
{
    public static void main(String[] args) {
        int[] list = {10,20,70,70,70,90,60,60};

        for (int i = 0; i <list.length; i++){

            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if(alreadyCounted){
                continue;
            }

            int count = 0;
            for (int k = 0; k < list.length; k++){
                if(list[i] == list[k]){
                    count++;
                }
            }
            System.out.println(list[i] + " Sayısı " + count + " Kadar Tekrar etti");

        }







    }
}
