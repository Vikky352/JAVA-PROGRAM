import java.util.Scanner;

public class set_bit {
    public static void main(String[] arg) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n =sc.nextInt();
        System.out.print("Enter position :- ");
        int p = sc.nextInt();
        int bitmas = 1 << p;
        int newnum = (bitmas | n);
        System.out.println("New set value will be:- " + newnum);
        sc.close();
    }
}
