
public class dynamic_pattern {
public static void main(String[] args) {
    for(int i=0;i<5;i++){
        for(int j=i;j<2;j++){
            System.out.print(" ");
        }
        int n=(i*2)+1;
        for(int k=0;k<n;k++){
            System.out.print("*");
        }
        if(n==5)
         break;
        System.out.println();
    }
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(j==0||j==4)
            System.out.print("@");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
}
    
}