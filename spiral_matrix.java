import java.util.Scanner;

public class spiral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row &column:- ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int r = 0, c = 0;
        int er = m - 1, ec = n - 1;
        while (r <= er && c <= ec) {
            for (int i = 0; i < er; i++) {
                System.out.print(a[r][i] + " ");
            }
            r++;
            for (int i = 0; i < ec; i++) {
                System.out.print(a[i][ec] + " ");
            }

            ec--;
            for (int i = ec; i >= 0; i--) {
                System.out.print(a[er][i] + " ");
            }
            er--;
            for (int i = er; i >= 0; i--) {
                System.out.print(a[i][ec] + " ");
            }
            c++;
            System.out.println();
            sc.close();
        }
    }
}
