import java.util.Scanner;

public class update_bits {
    public static void main(String[] argss) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n = sc.nextInt();
        System.out.print("Enter operator 0 and 1 :-");
        int opt = sc.nextInt();
        System.out.print("Enter position :-");
        int p = sc.nextInt();
        int bitmas = 1 << p;
        if (opt == 0) {
            int newnum = bitmas | n;
            System.out.print("New number is :- " + newnum);
        } else {
            int not = ~bitmas;
            int newnum = not & n;
            System.out.print("New number is :- " + newnum);
        }
        sc.close();
    }
}
