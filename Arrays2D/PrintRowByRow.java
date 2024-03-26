package Arrays2D;

import java.util.Scanner;

public class PrintRowByRow {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int row = 3;
        int col = 3;
        int[][] mat = new int[row][col];
        for(int i = 0; i<row;i++){
            for(int j = 0; j<col;j++){
                mat[i][j] = scr.nextInt();
            }
        }

        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
