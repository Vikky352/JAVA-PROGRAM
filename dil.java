
public class dil {
 public static void main(String[] args) {
    System.out.println();
    for (int i = 1; i <=4; i++) {
        for(int l=0;l<5-i;l++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*"+" ");
        }
        for(int k=0;k<4-i;k++){
            System.out.print(" ");
        }
        for(int l=0;l<4-i;l++){
            System.out.print(" ");
        }
        for(int l=0;l<i;l++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    for(int j=0;j<9;j++){
        for(int l=0;l<j;l++){
            System.out.print(" ");
        }
        for(int k=0;k<9-j;k++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
 }
    
}