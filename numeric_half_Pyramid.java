public class numeric_half_Pyramid {
    public static void main(String[] args) {
       int l=5;
        for(int i=1;i<=5;i++){
          l=l-1;
          for(int j=1;j<=l;j++){
              System.out.print(" ");
          }  
          for(int k=1;k<=i;k++){
              System.out.print(k+" ");
          }
          System.out.println();
        }
    }
}
