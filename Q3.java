import java.util.Scanner;
//program to calculate  simple interest.
public class Q3 {
public static float si(int p,int r,int t)  
{
    float si=0;
    si=(p*r*t)/100;
    return si;
}
public static void main(String[]args)
{   int p,r,t;
    float res;
    Scanner dc=new Scanner(System.in);
    System.out.print("enter principle :-");
    p=dc.nextInt();
    System.out.print("enter rate :-");
    r=dc.nextInt();
    System.out.print("enter time :-");
    t=dc.nextInt();
    res=si(p,r,t);
    System.out.print("simple interest :-"+res);
    dc.close();
}
    
}
