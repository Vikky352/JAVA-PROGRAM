import java.util.Scanner;
//program of odd and even 
public class Q13 {
    
    public static void main(String[] args) {
        int x; 
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:- ");
        x=sc.nextInt();
        if(x%2==0)
        System.out.println("number is even:- "+x);
        else
        System.out.println("number is odd:- "+x);
        sc.close();

    }
}
