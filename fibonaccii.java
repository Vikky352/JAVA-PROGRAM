import java.util.Scanner;

public class fibonaccii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of term:-");
        int n=sc.nextInt();
        int x=0,y=1,z=0;
        for(int i=1;i<=n;i++){
            System.out.print(z+" ");
            z=x+y;
            y=x;
            x=z;
            
        }
    }
}
