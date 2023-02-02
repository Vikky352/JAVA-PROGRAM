import java.util.Scanner;
//proram to left shift the operator
public class Q14 {
    public static void main(String[] args) {
        int x; 
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number to shift:- ");
        x=sc.nextInt();
        x=x<<2;//here "<<" is the left shift operator
        System.out.println("left shifted number will be:- "+x);
        sc.close();
    }
}
