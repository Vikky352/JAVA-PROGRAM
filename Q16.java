import java.util.Scanner;
//arithmatic operation 
public class Q16
{
    public static void main(String[] args)
    {
        int x, y;
        String p,c;
        Scanner sc = new Scanner(System.in);              
        
        do{

            System.out.print("enter first number:- ");
            x = sc.nextInt();
            System.out.print("enter second number:- ");
            y = sc.nextInt();
            System.out.print("enter your choice(+,-,*,/,%):- ");
            p = sc.next();
            switch (p) 
            {
                case "+":
                int s = x + y;
                System.out.println("sum:- " + s);
                    break;
                case "-":
                    s = x - y;
                    System.out.println("subtract:- " + s);
                    break;
                case "*":
                    s = x * y;
                    System.out.println("product:- " + s);
                    break;
                case "/":
                    s = x / y;
                    System.out.println("divide:- " + s);
                    break;
                case "%":
                    s = x % y;
                    System.out.println("reminder:- " + s);
                    break;
                }
                System.out.print("do you want to continue(y/n):- ");
                c=sc.next();
            }while(c.equals("y"));
            sc.close();
        }
    }    