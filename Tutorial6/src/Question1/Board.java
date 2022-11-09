package Question1;

import java.util.*;

public class Board {
    int ar[][];
    int lengthOfArray;
    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];
// fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = generator.nextInt(101);
            }
        }
        lengthOfArray = ar.length;
    }

    // display the contents of the board
    public void print() {
        for (int[] r : ar) { // for all rows
            for (int c : r) // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }

    //Get the length of the created array

    public int findMaxInRow(int rowNum){
        int maxNum = 0;
        int lengthOfRow = ar[rowNum].length;
        for(int i = 0; i < lengthOfRow; i++ ){
            if(ar[rowNum][i] > maxNum){
                maxNum = ar[rowNum][i];
            }
        }
        return maxNum;
    }

    public int findMaxInColumn (int columnNum){
        int maxNum = 0;
        for(int i = 0; i < lengthOfArray; i ++){
            if (ar[i][columnNum] > maxNum){
                maxNum = ar[i][columnNum];
            }
        }
        return maxNum;
    }

    public int findMaxInDiagonal(){

        int maxNum = 0;
        for (int i = 0; i < lengthOfArray; i ++ ){
            int lengthOfRow = ar[i].length;
            for (int j = 0; i < lengthOfRow; i++ ){
                if(ar[i][j] > maxNum){
                    maxNum = ar[i][j];
                }
            }
        }
        return maxNum;
    }
}
