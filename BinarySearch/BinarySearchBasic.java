public class BinarySearchBasic{
    public static int binarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target) return mid;

            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        } return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 4;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}