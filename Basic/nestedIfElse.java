import java.util.*;
/*
 * Given the number N, Categorise the number according to following condition :
1. Odd-Positive
2. Odd-Negative
3. Even-Positive
4. Even-Negative

Note : Intention of problem is to teach you Nested If-Else, so try to solve this problem using nested if-else
 * 
*/
public class nestedIfElse {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        if(num%2==1){
            if(num>=0){
                System.out.println("Odd-Positive");
            } else{
                System.out.println("Odd-Negative");
            }
        } else{
            if(num>=0){
                System.out.println("Even-Positive");
            } else {
                System.out.println("Even-Negative");
            }
        }
    }
}
