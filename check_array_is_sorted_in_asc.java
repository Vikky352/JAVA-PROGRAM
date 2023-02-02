import java.util.Scanner;

public class check_array_is_sorted_in_asc {
    public static void main(String[] args) {
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr length of array:- ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("enetr element of array:- ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                b = false;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        if (b == true)
            System.out.print(" Array is sorted in ascending order");
        else
            System.out.print(" array is not sorted in ascending order");
        sc.close();
    }
}
