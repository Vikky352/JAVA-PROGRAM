import java.util.*;

public class  circumferenceOfCircle {
    public static double circumference(int r) {
        double cir = 2 * 3.14 * r;
        return cir;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius of circle:- ");
        int r = sc.nextInt();
        double c = circumference(r);
        System.out.println("circumference of circle is :- " + c);
        sc.close();
    }
}
