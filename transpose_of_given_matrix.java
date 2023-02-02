import java.util.Scanner;

public class transpose_of_given_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of 2d array:- ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }System.out.println("Matrix are:- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix:- ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}