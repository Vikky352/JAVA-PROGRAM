import java.util.*;
public class Q5 {
    public static void  main(String[]args)
    {
        int m1,m2,m3,m4,m5,total,percent;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks of first sub :-");
        m1=sc.nextInt();
        System.out.print("enter marks of second sub :-");
        m2=sc.nextInt();
        System.out.print("enter marks of third sub :-");
        m3=sc.nextInt();
        System.out.print("enter marks of four sub :-");
        m4=sc.nextInt();
        System.out.print("enter marks of five sub :-");
        m5=sc.nextInt();
        total=m1+m2+m3+m4+m5;
        System.out.println("total marks:-"+total);
        percent=total/5;
        System.out.println("percentage of marks:-"+percent+"%");
        sc.close();
        
    }
}
