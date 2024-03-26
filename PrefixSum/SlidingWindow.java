package PrefixSum;

public class SlidingWindow {

    public static void main(String[] args) {
        
        int[] a = {2,9,31,-4,21,7};
        int k= 3;
        int wSum = 0; // initialize a window sum to 0
        int mSum = Integer.MIN_VALUE; // initialize the maximum sum to the smallest possible integer value

        for (int i = 0; i < k; i++) { // iterate through the first k elements of the input array
            wSum += a[i]; // add the element to the window sum
        }

        // The outer loop starts from k, since we have already calculated the maximum
        // sum for the first k elements
        for (int i = k; i < a.length; i++) {
            // remove the first element of the window (i-k) and add the current element to
            // the window sum
            wSum = wSum - a[i - k] + a[i];

            // update the maximum sum if the current window sum is greater than the previous
            // maximum sum
            mSum = Math.max(mSum, wSum);
        }

        // return the maximum sum
        System.out.println(mSum);
    }
}