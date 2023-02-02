import java.util.*;
public class count_of_array {
    public static void main(String[]args) {
        System.out.print("enter number you want to enter :-");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n]; 
       int c=0,d=0,e=0;
       for(int i=0;i<n;i++){
            a[i]= sc.nextInt();         
           if(a[i]<0){
            c++;
           }
        else if (a[i]==0) {
            d++;            
        } else {
            e++;
        }
       }
        System.out.println("total number of negative number is:-"+c);
        System.out.println("total number of zero number is:-"+d);
        System.out.println("total number of positive number is:-"+e);
    sc.close();
  
     
    }
    
}