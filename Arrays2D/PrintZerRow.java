package Arrays2D;
import java.util.*;
public class PrintZerRow {
    public static void printZeroRow(int mat[][]) {
        int n = mat.length;
        
        for (int c = 0; c < n; c++) // columns
        {
            System.out.print(mat[0][c] + " ");
        }
    }

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

        printZeroRow(mat);
    }
}
