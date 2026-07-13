package FinalProject_MineSweeper;

import java.util.Scanner;

public class MineSweeper {
    Scanner scanner = new Scanner(System.in);
    String mine = "*";
    String empty = "-";
    int row;
    int column;
    int totalSafeCells;
    int openedCells;
    String[][] board;
    String[][] map;

    MineSweeper() {
    }

    // Orchestrates the entire game flow
    void run(){
        setMatrixSize();
        prepareMap();
        System.out.println("========================");

        play();
    }

    // Gets game board dimensions from the user
    void setMatrixSize() {
        while(true) {
            System.out.println("Please configure the game board size:");
            System.out.print("Enter Number of Rows (Minimum 2): ");
            this.row = scanner.nextInt();
            System.out.print("Enter Number of Columns (Minimum 2): ");
            this.column = scanner.nextInt();

            if(this.row >= 2 && this.column >= 2) {
                this.board = new String[this.row][this.column];
                this.map = new String[this.row][this.column];
                break;
            }
            System.out.println("ERROR! Board size must be at least 2x2.\n");
        }
    }

    void prepareMap() {
        // Fills both boards with the empty symbol "-"
        for(int i = 0; i < this.row; i++){
            for(int j = 0; j < this.column; j++){
                this.board[i][j] = this.empty;
                this.map[i][j] = this.empty;
            }
        }

        // Setting up the mines
        int mineCount = (row * column) / 4;
        int placedMine = 0;
        this.totalSafeCells = (row * column) - mineCount;

        // Places mines at random coordinates
        while(placedMine < mineCount){
            int randomRow = (int)(Math.random() * row);
            int randomColumn = (int)(Math.random() * column);

            // Checks if there is already a mine in the map before placing one
            if(!this.map[randomRow][randomColumn].equals("*") && (!this.board[randomRow][randomColumn].equals("*"))){
                this.map[randomRow][randomColumn] = "*";
                placedMine++;
            }
        }
    }

    // Main game mechanics loop
    void play() {
        while(true) {
            print();

            System.out.print("Enter row index: ");
            int chosenRow = scanner.nextInt();
            System.out.print("Enter column index: ");
            int chosenColumn = scanner.nextInt();

            if (chosenRow < 0 || chosenRow >= this.row || chosenColumn < 0 || chosenColumn >= this.column){
                System.out.println("ERROR! Chosen coordinates are out of bounds.");
                continue;
            }

            if (!this.board[chosenRow][chosenColumn].equals(this.empty)){
                System.out.println("You have already selected these coordinates. Please try another one!");
                continue;
            }

            // Lose scenario
            if(this.map[chosenRow][chosenColumn].equals(this.mine)){
                System.out.println("BOOM! Game Over!");

                // Reveals all mine locations upon losing
                for (int i = 0; i < this.row; i++) {
                    for (int j = 0; j < this.column; j++) {
                        if (this.map[i][j].equals(this.mine)) {
                            this.board[i][j] = this.mine;
                        }
                    }
                }

                print();
                break;
            }

            int mineCount = 0;

            // Iterates through neighboring cells to count adjacent mines
            for (int i = -1; i <= 1; i++){
                for(int j = -1; j <= 1; j++){
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

            this.openedCells++;

            // Win scenario
            if(this.totalSafeCells == this.openedCells){
                print();
                System.out.println("Congratulations! You Won!");
                break;
            }
        }
    }

    // Prints the current state of the board to the console
    void print(){
        System.out.println("===================================");
        for (int i = 0; i < this.row; i++){
            for(int j = 0; j < this.column; j++){
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===================================");
    }
}