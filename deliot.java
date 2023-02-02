import java.util.*;
public class deliot {
    public static void count(String s){
        int n=s.length();
        char[] ch=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=s.charAt(i);
        }
        String r="";
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(ch[i]==ch[j])
                    c++;
            }
            if(!r.contains(Character.toString(ch[i])))
                r=r+ch[i]+c;
        }
         System.out.println(r);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String");
        String a=sc.next();
        count(a);
        sc.close();
    }
    
}

