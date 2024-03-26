package PrefixSum;
import java.util.Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,-2};
        int size = arr.length;
        long lsum =0;
        long sum=0;
        int ans = -1;
        if(size==1) ans= 1;

        for(int i=0; i<size; i++){
            sum += arr[i];
        }

        for(int i=0; i<size;i++){
            if (lsum == sum-arr[i]) ans= i+1;
            lsum = lsum+arr[i];
            sum = sum-arr[i];
        }
        System.out.println(ans);
        
    }
}
