import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean Isprime = true;
        if (num==2){
            Isprime = true;
        }else{
            for(int i=2; i<=Math.sqrt(num);i++){
                if(num%i==0){
                    Isprime = false;
                } else{
                    Isprime = true;
                }
            }
        }

        if(Isprime == true){
            System.out.println("Prime");
        } else{
            System.out.println("Not Prime");
        }
    }
}
