import java.util.*;
public class test2 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    String[] arr=new String[n];
    
    
     
    System.out.println("******Initializing array******");
    System.out.println("Enter "+arr.length+" string values");
    for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextLine();
    } 
    //displaying the array elements
    System.out.println("\n******displaying array elements******");
    System.out.println("Entered Strings are");
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]+"\t");
    }
   } 
}
