import java.util.Scanner;

public class bai2 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang ");
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
            A[i]=sc.nextInt();
        int M[]=new int[n];
        for (int i=0;i<n;i++){
            if(i%2==1){
                int left = (i - 1 >= 0) ? A[i - 1] : 0;
                int right = (i + 1 < n) ? A[i + 1] : 0;
                M[i] = A[i] + Math.abs(right - left );}
            else
                M[i]=A[i];
        }
        for (int i=0;i<n;i++)
            System.out.print(M[i]+" ");



    }
}
