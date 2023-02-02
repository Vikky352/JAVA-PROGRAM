import java.util.*;

public class power_of_another_number {
    public static int power(int x, int y) {
        int r = 1;
        for (int i = 1; i <= y; i++) {
            r = r * x;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:- ");
        int x = sc.nextInt();
        System.out.print("enter number of exponent:- ");
        int e = sc.nextInt();
        int res = power(x, e);
        System.out.println("vaue of " + x + " power " + e + " will be:- " + res);
        sc.close();
    }
}
