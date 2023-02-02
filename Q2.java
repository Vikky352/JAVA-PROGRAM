import java.util.*;
// calculate circumference of the circle.
public class Q2 {
    public  void circle(int r)
    {
        float pi=3.14f,crm=0f;
        crm=2*pi*r;
        System.out.print("ciurcumference of circle :-"+crm);
    }
    public static void main(String[] args)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter radius of circle :-");
        x=sc.nextInt();
         Q2 obj=new Q2();
        obj.circle(x);
         sc.close();
    }
}
