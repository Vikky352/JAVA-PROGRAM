import java.util.Scanner;
//program to  print table of given number.
public class Q9 {
    public static void table(int x)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(x+"*"+i+"="+x*i);
        }
    }
    public static void main(String[] args) {
        
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number to print table:- ");
        x=sc.nextInt();
        table(x);
        sc.close();
    }
}
