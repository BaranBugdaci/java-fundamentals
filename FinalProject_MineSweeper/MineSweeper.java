package FinalProject_MineSweeper;

import java.util.Scanner;

public class MineSweeper {
    Scanner scanner = new Scanner(System.in);
    String mine = "*";
    String empty = "-";
    int row;
    int column;
    int totalSafeCells;
    int oppenedCells;
    String[][] board;
    String[][] map;


    MineSweeper() {
    }

    void run(){
        matrisCount();
        preaperMap();
        System.out.println("========================");

        play();
    }

    void matrisCount() {
        while(true) {
            System.out.println("Lütfen Oyun tahtasının boyutunu ayarlayınız ");
            System.out.print("Satır Sayısını Giriniz(Minimum 2): ");
            this.row = scanner.nextInt();
            System.out.print("Sütun Sayısını Giriniz(Minimum 2): ");
            this.column = scanner.nextInt();

            if(this.row >= 2 && this.column >= 2) {
                this.board = new String[this.row][this.column];
                this.map = new String[this.row][this.column];
                break;
            }
            System.out.println("HATA! Matris Boyutu Minimum 2x2 Olabilir\n");
        }
    }

    void preaperMap() {
        // İki tahtayı da "-" değeri ile dolduruyoruz
        for(int i = 0; i < this.row; i++){
            for(int j = 0; j < this.column; j++){
                this.board[i][j] = this.empty;
                this.map[i][j] = this.empty;
            }
        }

        // Mayınları yerleştirme
        int mineCount = (row * column) / 4;
        int placedMine = 0;
        this.totalSafeCells = (row * column) - mineCount;

        while(placedMine < mineCount){
            int randomRow = (int)(Math.random() * row);
            int randomColumn = (int)(Math.random() * column);

            if(!this.map[randomRow][randomColumn].equals("*") && (!this.board[randomRow][randomColumn].equals("*"))){
                this.map[randomRow][randomColumn] = "*";
                placedMine++;
            }
        }
    }


    void play() {
        while(true) {
            print();

            System.out.print("Satır sırasını giriniz: ");
            int chosenRow = scanner.nextInt();
            System.out.print("Sütun sırasını giriniz: ");
            int chosenColumn = scanner.nextInt();

            if (chosenRow < 0 || chosenRow >= this.row || chosenColumn < 0 || chosenColumn >= this.column){
                System.out.println("HATA! Girdiğiniz koordinatlar harita sınırları dışında.");
                continue;
            }

            if (!this.board[chosenRow][chosenColumn].equals(this.empty)){
                System.out.println("Girdiğiniz Koordinata daha önce işlem yaptınız. Başka bir kordinat giriniz!");
                continue;
            }

            if(this.map[chosenRow][chosenColumn].equals(this.mine)){
                System.out.println("BOOM! Game Over!");

                for (int i = 0; i < this.row; i++) {
                    for (int j = 0; j < this.column; j++) {
                        //mayınların nerde olduğunu gösterir
                        if (this.map[i][j].equals(this.mine)) {
                            this.board[i][j] = this.mine;
                        }
                    }
                }

                print();

                break;
            }

            int mineCount = 0;

            for (int i = -1; i <= 1;i++){
                for(int j = -1; j <= 1;j++){
                    int neighborRow = chosenRow + i;
                    int neighborColumn = chosenColumn + j;

                    if((neighborRow >= 0 && neighborRow < this.row) && (neighborColumn >= 0 && neighborColumn < this.column)){

                        if(this.map[neighborRow][neighborColumn].equals(this.mine)){
                            mineCount++;
                        }
                    }
                }
            }
            this.board[chosenRow][chosenColumn] = String.valueOf(mineCount);

            this.oppenedCells++;

            if(this.totalSafeCells == this.oppenedCells){
                print();
                System.out.println("Congrulations! You Won!");
                break;
            }

        }
    }
    void print(){
        System.out.println("===================================");
        for (int i = 0; i < this.row;i++){
            for(int j = 0; j < this.column;j++){
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

}