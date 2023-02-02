//swap of two number without using third variable
import java.util.Scanner;
public class Q6 {
    public static void  swap(int x,int y)
    {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swap numbers are:-\n"+x+"\n"+y);
    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:-");
        x=sc.nextInt();
        System.out.print("enter second number :-");
        y=sc.nextInt();
        swap(x, y);
        sc.close();
    }
    
}
