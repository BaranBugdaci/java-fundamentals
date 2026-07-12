package Arrays;
import java.util.Arrays;
public class ArraySinifiKullanimi
{
    public static void main(String[] args) {
        int[] list = {26,922,96,1,7,58,2,21,5,-5,5};

        System.out.println(Arrays.toString(list));//Ekrana yazdırır

       Arrays.fill(list,3,7,7); // Belirli Aralıklardaki indexlerin değerini değiştirir aralık yoksa hepsi değişir
       System.out.println(Arrays.toString(list));

        Arrays.sort(list);//Dizideki elemanları sıralar
        System.out.println(Arrays.toString(list));

       int index =  Arrays.binarySearch(list,21);// aradığın elemanın kaçıncı indexte olduğunu gösterir
        System.out.println("-5 indeksi : " + index);// bunun için elemanlar sıralı olmalıdır

        int[] copyList = Arrays.copyOf(list,list.length);//diziyi kopyalar
        System.out.println(Arrays.toString(copyList));

        int[] copyList2 = Arrays.copyOfRange(copyList,0,8);//belirli bir aralıktakileri copyalar
        System.out.println(Arrays.toString(copyList2));

        System.out.println(Arrays.equals(list,copyList));//diziler birbirine eşit mi karşılaştırır
    }
}
