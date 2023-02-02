import java.util.Scanner;
public class reverse_array_till_kth {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int ar[] = new int[n];
        int br[]=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int j = p-1;
        for (int i = 0; i <n; i++) {
            if (i< p) {
                br[i]=ar[j];
                j--;
            }
            else{
                br[i] = ar[i];}
        }
        for (int i = 0; i < n; i++) {
            System.out.println(br[i]);
        }
        sc.close();
    }
}
