import java.util.Scanner;

public class min_and_max_array {
    public static void main(String[] args) {
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr size of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter element of array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        x=arr[0];
        y=arr[0];
        for (int j = 1; j < n; j++) {
            if (arr[j] > x)
                x = arr[j];
            if (arr[j] < y)
                y = arr[j];
        }
        System.out.println("maximum number of array :- " + x);
        System.out.println("minimum numer of array :- " + y);
        sc.close();
    }

}