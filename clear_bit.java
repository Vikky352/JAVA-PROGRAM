import java.util.Scanner;

public class clear_bit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int n = sc.nextInt();
        System.out.print("enetr position:- ");
        int p = sc.nextInt();
        int bitmas = 1 << p;
        int not = ~(bitmas);
        int newnum = (not & n);
        System.out.print("new number :- " + newnum);
        sc.close();
    }
}
