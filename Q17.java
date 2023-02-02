import java.util.Scanner;
//program to input 10 natural number only consecutive number will be consider
public class Q17 {
    public static void main(String[] args) {
        int  i, r = 0;
        int a[] = new int[10];
        System.out.println("enter 10 consecutive natural number:- ");
        Scanner sc = new Scanner(System.in);
        a[0] = sc.nextInt();
        for (i = 1; i < 10;) {
            int b = sc.nextInt();
            if (a[i-1]==b-1) {
                a[i] = b;
                i++;
            }
        }
        System.out.println("list of given natural number are:- ");
        for (i = 0; i < 10; i++) {
            r = r + a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println("\nsum of 10 natural number are:-  " + r);
        sc.close();
    }
}
