import java.util.*;
import java.lang.Math;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        System.out.print("Enter user name :");
        String s1 = sc.next();
        System.out.print("Enter password: ");
        String s2 = sc.next();
        palindrome(n, s1, s2);
        sc.close();
    }

    public static void palindrome(int n, String u, String p) {
        String str1[] = new String[] { "user1", "user2", "user3", "user4", "user5" };
        String str2[] = new String[] { "pass1", "pass2", "pass3", "pass4", "pass5" };
        for (int i = 0; i < str1.length; i++) {
            if (u.equals(str1[i]) && p.equals(str2[i])) {
                int low = (int) Math.pow(10, n - 1);
                int high = (int) Math.pow(10, n) - 1;
                for (int j = low; j <= high; j++) {
                    int s = 0, r, tmp=j;
                    while (tmp > 0) {
                        r = tmp % 10;
                        s = s * 10 + r;
                        tmp = tmp / 10;
                    }
                    if (j == s) {
                        System.out.print(u + "Welcome your token no : " + s);
                        return;
                    }
                }
            } 
            else{
                System.out.print("Wrong userid and password please try again");
                break;
            }
        }
    }
}

