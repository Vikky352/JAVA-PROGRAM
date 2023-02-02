public class number_pyramid {
    public static void main(String[] args) {
        int l=5;
        for(int i=1;i<=5;i++){
            l=l-1;
            for(int k=1;k<=l;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
