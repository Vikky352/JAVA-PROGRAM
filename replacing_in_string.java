import java.util.Scanner;
public class replacing_in_string {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string :- ");
        String s=sc.nextLine();
        String st="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e' ||s.charAt(i)=='E'){
                st=st+'i';
            }
            else
            st=st+s.charAt(i);
        }
        System.out.println("new string is "+st);
        sc.close();
    }
}
