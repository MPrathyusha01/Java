public class LargestNumberArray {
    public static int MaxNumber(int arr[]){
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        } return max;
    }

    public static void main(String[] args) {
        int Input[] = {1,2,6,3,7,4};
        System.out.println(MaxNumber(Input));
    }
}