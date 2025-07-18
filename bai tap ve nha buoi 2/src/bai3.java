import java.util.Scanner;

public class bai3 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap kich thuoc ma tran: ");

        int n=sc.nextInt();
        int[][] a =new int[n][n];
        int value=1;
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;
        while (value<=n*n){
            for (int i=left;i<=right;i++){
                a[top][i]=value;
                value++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
                a[i][right]=value++;
            right--;
            for (int i = right; i >= left; i--)
                a[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--)
                a[i][left] = value++;
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
