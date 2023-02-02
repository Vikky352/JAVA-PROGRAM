import java.util.Scanner;
//program to calculate the hra, da ,pf, salary and final salary..
public class Q8 {
     public static void main(String[] args) {
         int hra, da,pf, sal,b_sal,f_sal;
         Scanner sc=new  Scanner(System.in);
         System.out.print("enter salary:- ");
         sal=sc.nextInt();
        System.out.print("enter rate(%) of hra:- ");
        hra=sc.nextInt();
        System.out.print("enter rate(%) of da:- ");
        da=sc.nextInt();
        System.out.print("enter rate(%) of pf:- ");
        pf=sc.nextInt();
        pf=sal*pf/100;
        hra=sal*hra/100;
        da=sal*da/100;
        b_sal=sal-pf;
        f_sal=b_sal+da+hra;
        System.out.println("Basic salary:-"+b_sal);
        System.out.println("Gross salary:-"+f_sal);
        sc.close();
     }
    
}
