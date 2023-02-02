import java.util.Scanner;

public class gcd {
    public static int powe(int x,int y){
        int s=0;
        if(x>y){
        for(int i=1;i<=y;i++){
            if(x%i==0&&y%i==0){
               s=i ;
            }
            
        }
     }
     else{
        for(int i=1;i<=x;i++){
            if(x%i==0&&y%i==0){
               s=i ;
            }
            
        }
     }
        return s;
    }

    public static void main(String[] args) {
        System.out.print("enter first number :- ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print("enter second number:-");
        int y=sc.nextInt();
        int p=powe(x,y); 
        System.out.println("greater common divission:- "+p);    
        sc.close();
    }
}
