import java.util.*;
public class greaterBetweenTwoNumber {
    public static int greater(int x,int y) {
        if(x>y)
        return x;
        else
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:- ");
        int x=sc.nextInt();
        System.out.print("enter second number:- ");
        int y=sc.nextInt();
       int g= greater(x,y);
       System.out.println("greatest number between "+x+" and "+y+" will be:- "+g);
       sc.close();
    }
}
