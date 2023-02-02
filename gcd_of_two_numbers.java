import java.util.*;

public class gcd_of_two_numbers {
    public static int gcd(int x, int y) {
        if (x == y)
            return x;
        else if (x % y == 0)
            return y;
        else if (y % x == 0)
            return x;
        else if (x > y)
            return gcd(x % y, y);
        else
            return gcd(x, y % x);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:- ");
        int a = sc.nextInt();
        System.out.print("enter second number:- ");
        int b = sc.nextInt();
        int r = gcd(a, b);
        System.out.print("gcd of the given number " + a + " and " + b + " will be :-" + r);
        sc.close();
    }
}
