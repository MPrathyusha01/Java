public class upperBoundBinarySearch {
    public static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>target){
                ans = mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        } return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,6};
        int target = 6;
        int ans = upperBound(arr, target);
        System.out.println(ans);
    }
}
