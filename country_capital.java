import java.util.Scanner;
//program to input country capital and searc through country 
public class country_capital {
    public static void main(String[] args) {
        String a[] = new String[20];
        String b[] = new String[20];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter country:- ");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextLine();
        }
        System.out.println("enter capital:- ");
        for (i = 0; i < 5; i++) {
            b[i] = sc.nextLine();
        }
        int n;
        do{
        System.out.println("press 1 for search & press 2 for dispplay all:-");
        int j = sc.nextInt();
        if (j == 1) {
            System.out.print("enter country to search their capital:-");
            String st = sc.next();
            for (i = 0; i < 5; i++) {
                if (a[i].equals(st)) {
                    System.out.println("capital of :-" + a[i] + " is " + b[i]);
                }
            }
        }
         else {
            System.out.println("country\t\tcapial");
            for (i = 0; i < 5; i++) {
                System.out.println(a[i] + "\t\t" + b[i]);
            }
        }
        System.out.print("do you want to vist again press 3:- ");
        n=sc.nextInt();
      }while(n==3);
        sc.close();
    }

}