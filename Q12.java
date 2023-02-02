import java.util.Scanner;
//program to check given year leap or not leap year
public class Q12 {
    public static void main(String[] args) {
        int  year;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter year:- ");
        year=sc.nextInt();
        if(year%4==0&& year%400==0)
     System.out.println("leap year "+year);
    else
     System.out.println("year is not leap year "+year);
    sc.close();
    }
}
