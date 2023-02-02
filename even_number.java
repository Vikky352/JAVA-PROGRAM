import java.util.*;
public class even_number {
    public static void even(int x) {
        if(x%2==0)
        System.out.println("number is even "+x);
        else
        System.out.println("number is odd "+x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number :- ");
        int n= sc.nextInt();
        even(n);
        sc.close();
    }
}
