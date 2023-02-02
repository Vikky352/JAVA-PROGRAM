public class Pascals_Triangle {
    public static void main(String[] args) {
        int n=5;
		int s=n;
		for(int i=0;i<n;i++){
			for(int j=1;j<=s;j++){
				System.out.print(" ");
			}
		int	num=1;
			for(int k=0;k<=i;k++){
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			s--;
			System.out.println();
		}
    }
}
