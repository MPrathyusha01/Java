// import java.util.ArrayList;
// import java.util.Arrays;
// public class GenerateSubArray {
//     public ArrayList<ArrayList<Integer>> Solve(ArrayList<Integer> A) {
//         int len = A.size();
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
//         for(int i=0; i<len;i++){
//             ArrayList<Integer> current = new ArrayList<Integer>();
//             for(int j=i;j<len;j++){
//                 current.add(A.get(j));
//             }
//             ans.add(current);
//         }
        
//         return ans;
        
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        
//         // Instantiate GenerateSubArray class
//         GenerateSubArray generator = new GenerateSubArray();
        
//         // Call Solve method on the instance
//         ArrayList<ArrayList<Integer>> result = generator.Solve(A);

//         // Print the result
//         for (ArrayList<Integer> subArray : result) {
//             System.out.println(subArray);
//         }
//     }


// }
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
               ArrayList<Integer> curr = new ArrayList<Integer>();
                 for(int k = s; k <= e; k++){
                     curr.add(A.get(k));
                }
                    ans.add(curr);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    
        // Instantiate GenerateSubArray class
        Solution generator = new Solution();
    
        // Call Solve method on the instance
        ArrayList<ArrayList<Integer>> result = generator.solve(A);
    
        // Print the result in the desired format
        for (ArrayList<Integer> subArray : result) {
            System.out.println(Arrays.toString(subArray.toArray()));
        }
    }
    
}
