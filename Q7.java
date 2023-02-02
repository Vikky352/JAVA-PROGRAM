import java.util.Scanner;
//program to reverse of given number
public class Q7 {
    public static void main(String[] args) {
        int n,r,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:-");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println("reverse of number:-"+s);
        sc.close();
    }
    
}
