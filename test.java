//import java.util.*;
public class test {
    public static void main(String[] args) {
        int max = 0;
        int a[] = { 8, 5, 1, 3, 2, 1, 8, 7, 1, 2, 2, 9 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        int arr[][] = new int[max + 1][2];
        for (int i = 1; i <= max; i++) {
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    c++;
                }

            }
            if (c != 0) {
                arr[i][0] = i;
                arr[i][1] = c;
                // System.out.println(i + " " + c);
            }
        }int p=0;
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j] == 0) {
                    i++;
                    break;
                }
            }

        }
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
