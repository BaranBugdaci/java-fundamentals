package Arrays;

public class CokDiziliArray
{
    static void main(String[] args) {
        int[][] uzaklik = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        for (int i = 0; i < uzaklik.length; i++){
            System.out.println();
            for (int j = 0; j < uzaklik[0].length; j ++){
                System.out.print(uzaklik[i][j] + " ");
            }
        }

        System.out.println("\n______________________________________________");

        int[][] matris = new int[3][4];
        int number = 1;
        for (int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[0].length; j++){
                matris[i][j] = number++;
            }
        }

        for(int i = 0; i < matris.length; i++){
            System.out.println();
            for(int j = 0; j < matris[0].length; j++){
                System.out.print(matris[i][j] + " ");
            }
        }



    }

}
