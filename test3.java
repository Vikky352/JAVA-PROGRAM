import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of names ");
        n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter " + n + " names ");

        for (int i = 0; i < names.length; i++) {
            sc = new Scanner(System.in);
            names[i] = sc.nextLine();

            System.gc();
        }

        System.out.println("\n\n");

        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);

    }
}
