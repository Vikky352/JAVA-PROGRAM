import java.util.*;

public class PrintSumOfAllOddNumbers {
    public static int SumOfOdd(int x) {
        int s = 0, c = 0;
        for (int i = 1; i > 0; i++) {
            if (i % 2 != 0) {
                c++;
                s = s + i;
            }
            if (c == x)
                break;

        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of term:- ");
        int x = sc.nextInt();
        int sum = SumOfOdd(x);
        System.out.print("sum of first " + x + " odd number is :-" + sum);
        sc.close();
    }

}