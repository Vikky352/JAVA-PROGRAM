public class palindrome {
    public static void main(String[] args) {
        int n=101,r,s=0,p=n;
        while(n>0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(p==s)
        System.out.println("palindrome "+s);
    }
}
