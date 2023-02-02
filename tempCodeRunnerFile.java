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