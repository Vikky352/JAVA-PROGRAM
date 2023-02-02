import java.util.*;
public class eligebleForVote {
    public static void vote(int x) {
        if(x>18)
        System.out.println("eligible for vote");
        else
        System.out.println("not eligible for vote");
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter age for check vote:- ");
       int a=sc.nextInt();
       vote(a);

   } 
}
