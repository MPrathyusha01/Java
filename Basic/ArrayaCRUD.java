import java.util.*;
public class ArrayaCRUD {
    Scanner sc = new Scanner(System.in);
    static int[] Markss = {199,98,97,96};
    public void Create(){
        //declare an array
        int[] Marks = new int[100];
        Marks[0] = sc.nextInt();
        Marks[1] = sc.nextInt();
        Marks[2] = sc.nextInt();
        Marks[3] = sc.nextInt();
        System.out.println("Che: "+Marks[0]);
        System.out.println("Phy: "+Marks[1]);
        System.out.println("Math: "+Marks[2]);
        System.out.println("Phy: "+Marks[3]);
    }

    public void Read(int[] Markss){
        for(int i:Markss){
            System.out.println(i);
        }
    }

    public void update(){
        
    }

    public static void main(String[] args) {
        ArrayaCRUD ac = new ArrayaCRUD();
        //ac.Create();
        //ac.Read(Markss);
    }
}
