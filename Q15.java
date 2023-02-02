import java.util.Scanner;
//program to print special day using switch case
public class Q15 {
   public static void main(String[] args) {
       String x; 
       Scanner sc=new Scanner(System.in);
       System.out.print("enter your choice for day:-  ");
       x=sc.next();
       x=x.toUpperCase();
       switch(x)
       {
           case "SUN":
           System.out.println("Sunday");
           break;
           case "MON":
           System.out.println("Monday");
           break;
           case "TUE":
           System.out.println("Tuesday");
           break;
           case "WED":
           System.out.println("wednesday");
           break;
           case "THR" :
           System.out.println("Thursday");
           break;
           case "FRI":
           System.out.println("Friday");
           break;
           case "SAT":
           System.out.println("Saturday");
           break;

       }
       sc.close();
   } 
}
