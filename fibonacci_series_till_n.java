import java.util.*;

public class fibonacci_series_till_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of term:- ");
        int n = sc.nextInt();
        int z = 0, x = 0, y = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(z + " ");
            z = x + y;
            y = x;
            x = z;
        }
        sc.close();
    }
}
