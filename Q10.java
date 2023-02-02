import java.util.Scanner;
//comparision between three numbers
public class Q10 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:- ");
        x=sc.nextInt();
        System.out.print("enter second number:- ");
        y=sc.nextInt();
        System.out.print("enter third number:- ");
        z=sc.nextInt();
        if(x>y&&x>z)
             System.out.println("largest number is:- "+x);
        else if(y>x&&y>z)
         System.out.println("largest number is:- "+y);
         else
         System.out.println("largest number is :-"+z);
         sc.close();
    }    
}
