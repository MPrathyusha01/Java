package PrefixSum;

import java.sql.Array;
import java.util.Arrays;

/**
 * PrefixSum
 */
public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = {4,2,7,-1,9,0,-2};
        int size = arr.length;
        int[] prefixarray= new int[size];
        prefixarray[0] = arr[0];

        for(int i=1;i<size;i++){
            prefixarray[i] = prefixarray[i-1]+arr[i];
        }

        System.out.println(Arrays.toString(prefixarray));

    }
}