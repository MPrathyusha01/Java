import java.util.ArrayList;

public class EquilibriumJava {
    public int solve(ArrayList<Integer> A) {
         int n = A.size();

        // Calculate the prefix sum array
        long[] prefixSum = new long[n];
        prefixSum[0] = A.get(0);

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }

        // Calculate the total sum of the array
        long totalSum = prefixSum[n - 1];

        // Iterate through the array to find equilibrium index
        for (int i = 0; i < n; i++) {
            long leftSum = i > 0 ? prefixSum[i - 1] : 0;
            long rightSum = totalSum - prefixSum[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        // If no equilibrium index is found
        return -1;
    }
}
