import java.util.*;
public class table {
    public static void tbl(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x+"*"+i+"="+x*i);
        }
     }
   public static void main(String[] args) {
       System.out.print("enter number to print table:-");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       tbl(n);
    sc.close();
   } 
}
