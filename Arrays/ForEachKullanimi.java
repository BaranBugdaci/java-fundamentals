package Arrays;

public class ForEachKullanimi
{
    public static void main(String[] args) {
        int[][] matris = new int[3][4];
        int number = 1;
        for(int i = 0; i < matris.length;i++){
            for(int j = 0; j < matris[0].length;j++){
                matris[i][j] = number++;
            }
        }
        for(int[] i : matris){
            for(int elem : i){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
