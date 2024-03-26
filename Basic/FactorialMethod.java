public class FactorialMethod {

    public static int Factorial(int num){
        int factorial = 1;
        while(num!=0){
            factorial *= num;
            num-=1;
        }
        return factorial;
    }
    public static void main(String[] args){
        System.out.println(Factorial(4));
    }
}
