import java.util.Scanner;

public class length_of_aaray_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:- ");
        int n = sc.nextInt();
        String str[] = new String[n];
        System.out.println("enter sring to the array:- ");
        for (int i = 0; i < str.length; i++) {
            sc = new Scanner(System.in);
            str[i] = sc.nextLine();
        }
        int l = 0;
        for (int i = 0; i < str.length; i++) {
            l = l + str[i].length();
        }
        System.out.print("Length of " + n + " given String are:- " + l);
        sc.close();
    }
}
