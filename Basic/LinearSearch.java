public class LinearSearch {
    public static int LinearFind(int arr[], int key){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        int Input[] = {1,2,3,45,5,6,7};
        int key = 45;
        int ans = LinearFind(Input, key);
        if(ans==-1){
            System.out.println("NOT FOUND");
        } else{
            System.out.println("The position of "+key+" is "+ans);
        }
    }
}
