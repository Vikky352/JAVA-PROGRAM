import java.util.*;
import java.lang.Math;

public class Authentication {
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
        int flag=0;
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].equals(u) && str2[i].equals(p)) {
                int low = (int) Math.pow(10, n - 1);
                int high = (int) Math.pow(10, n) - 1;
                for (int j = low; j < high; j++) {
                    int s = 0, r, o = j;
                    while (o > 0) {
                        r = o % 10;
                        s = s * 10 + r;
                        o = o / 10;
                    }
                    if (j == s) {
                        System.out.print(u + " Welcome your token no : " + s);
                        flag=1;
                        return;
                    }
                }
            } 
        }
        if(flag==0)
        System.out.print("Wrong userid and password please try again");
    }
}
