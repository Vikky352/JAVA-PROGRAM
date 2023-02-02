public class insertion_sort {
    public static void main(String[] args) {
        int[] a={1276,5432,8791,4562,7834,4356,9001,3782,2671,3421,6927};
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
