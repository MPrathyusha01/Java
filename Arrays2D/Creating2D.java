package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class Creating2D {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int row = 3;
        int column = 4;
        int[][] arr = new int[row][column];
        for(int i = 0; i<row;i++){
            for(int j = 0; j<column;j++){
                arr[i][j] = scr.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
