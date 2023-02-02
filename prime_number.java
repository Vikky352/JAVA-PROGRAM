import java.util.*;
public class prime_number {
    void prime(int x){
        int c=0;
        for(int i=2;i<10;i++){
            if(x%i==0)
            c++;
        }
        if(c==0)
        System.out.println("number is prime "+x);
        else
         System.out.println("number is not prime "+x);

    }
    public static void main(String[] args) {
        System.out.print("enter number greater than 10:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime_number p=new prime_number();
        p.prime(n);
        sc.close();
    }
}
