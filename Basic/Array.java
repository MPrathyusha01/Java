import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 8, 10,9};
int[] evens = Arrays.stream(numbers).filter(num -> num % 2 == 0).toArray();
// 'evens' will be {8}
    System.out.println("Evens: " + Arrays.toString(evens));

    }
}
