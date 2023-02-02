//import java.util.*;
public class dublicate_string {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        String s = "my name is my is";
        String[] s1 = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            String str = " ";
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != ' ') {
                    str = str + s.charAt(j);
                }
            }
            s1[i]=str;
        }
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }

        // sc.close();
    }
}
