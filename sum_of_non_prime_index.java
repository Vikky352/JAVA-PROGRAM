import java.util.Scanner;
public class sum_of_non_prime_index {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  br[]= new int[n];
        for(int i=0;i<n;i++){
            br[i]=sc.nextInt();
        }
        int s = br[0]+br[1];
        for (int i = 2; i < n; i++) {
            int c = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    c++;
                    break;
                }
            }
            if (c != 0) {
                s = s + br[i];
            }
        }
        System.out.println(s);
        sc.close();
    }
}
