 import java.util.*;
public class count_positive_negative_and_zero_number {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter number of term :-");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter element:-");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }int p=0,q=0,r=0;
    for(int i=0;i<n;i++){
        if(arr[i]>0)
        p++;
        else if(arr[i]<0)
        q++;
        else
            r++;
    }
    System.out.println("Total number of positive number :-"+p);
    System.out.println("Total number of negative number :-"+q);
    System.out.println("Total number of zero number :- "+r);
    sc.close();
}
    
}