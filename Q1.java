import java.util.*;
//sum of two numbers 
public class Q1 {
    public static void main(String[] args)
    {
        int x,y,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number :-");
        x=sc.nextInt();
        System.out.print("enter second number :-");
        y=sc.nextInt();
        sum=x+y;
        System.out.print("sum of two number :-"+sum );
        sc.close();
    }
    
}
