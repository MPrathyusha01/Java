package PrefixSum;

import java.util.Arrays;

public class SumOfArrayRange {
    public static void main(String[] args) {
        int[] arr = {4,2,7,-1,9,0,-2};
        int size = arr.length;
        int[] prefixarray= new int[size];
        int[] sum = {1,2};
        prefixarray[0] = arr[0];
        int ans=0;

        for(int i=1;i<size;i++){
            prefixarray[i] = prefixarray[i-1]+arr[i];
        }

        //System.out.println(Arrays.toString(prefixarray));
        if(sum[0]==0){
            ans = prefixarray[sum[1]];
        } else{
            ans = prefixarray[sum[1]]-prefixarray[sum[0]-1];
        }
        System.out.println(ans);
    }
}
