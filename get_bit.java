import java.util.Scanner;

public class get_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numbe:- ");
        int n = sc.nextInt();
        System.out.print("enter positionto get value:- ");
        int p = sc.nextInt();
        int bitmas = 1 << p;
        if ((bitmas & n) == 0) {
            System.out.println("number is zero");
        } else {
            System.out.println("number is one");
        }
        sc.close();
    }
}
