import java.util.Scanner;

public class compar_two_string {
    public static void main(String[] args) {
        System.out.println("Enter two String:- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if (s.equals(t)) {
            System.out.println(s +"  and " + t + " both are equal string ");
        } else {
            System.out.print(s + " and " + t + " both are different string ");
        }
        sc.close();
    }
}
