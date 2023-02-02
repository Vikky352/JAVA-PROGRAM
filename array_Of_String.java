import java.util.Scanner;

public class array_Of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of array :- ");
        int n = sc.nextInt();
        String str[] = new String[n];
        System.out.println("enter names:- ");
        for (int i = 0; i < n; i++) {
            sc = new Scanner(System.in);
            str[i] = sc.nextLine();
        }
        System.out.println("Names are:- ");
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + " name = " + str[i]);
        }
        sc.close();
    }
}
