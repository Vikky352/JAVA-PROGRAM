import java.util.*;

// convert degree cencius to farenhiet
public class Q4 {
    public static void convrt(int cen) {
        float p = 0;
        p = (float)(1.8 *cen + 32);
        System.out.print("farenhiet:-" + p);
    }

    public static void main(String[] args) {
        int cen;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter celcius :-");
        cen = sc.nextInt();
        convrt(cen);
        sc.close();
    }
}