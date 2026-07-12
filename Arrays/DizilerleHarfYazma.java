package Arrays;

public class DizilerleHarfYazma
{
    public static void main(String[] args) {
        String[][] harfDizisi = new String[7][4];

        for(int i = 0; i < harfDizisi.length; i++){
          for (int j = 0; j < harfDizisi[i].length; j++){
              if (i == 0 || i == 3 || i == 6){
                  harfDizisi[i][j] = " *";
              } else if (j == 0 || j == 3) {
                  harfDizisi [i][j] = " *";
              }else{
                  harfDizisi[i][j] = "  ";
              }
          }
        }
        for(String[] row : harfDizisi){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
