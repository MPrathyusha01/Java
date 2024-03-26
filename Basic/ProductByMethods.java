public class ProductByMethods{
    public static int ProductNumbers(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        int output = ProductNumbers(10, 5);
        System.out.println(output);
    }
}