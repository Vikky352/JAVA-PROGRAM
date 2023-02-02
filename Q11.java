import java.util.Scanner;
//use of conditional operator
public class Q11 {
    public static void main(String[] args) {
        int  x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:- ");
        x=sc.nextInt();
        System.out.println("enter second number:- ");
        y=sc.nextInt();
         if(x>y)//here we use of conditional operator
         System.out.println("first is greatest");
         else
         System.out.println("second is greatest");
        sc.close();
    }
}
