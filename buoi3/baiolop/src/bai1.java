

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static int nhap(){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }
    public static int tongCacsochan(int a[],int n){
        int sum=0;
        for (int i=0;i<n;i++){
            if (a[i]%2==0)
                sum=sum+a[i];
        }
        return sum;
    }
    public static int tongCacsole(int a[],int n){
        int sumle=0;
        for (int i=0;i<n;i++)
            if (a[i]%2!=0)
                sumle=sumle+a[i];
        return sumle;
    }
    public static int demSonguyento(int a[],int n){
        int snt=0;
        for (int i=0;i<n;i++) {

            int dem = 0;
            for (int b = 1; b <= a[i]; b++) {
                if (a[i] % b == 0)
                    dem++;
            }if (dem==2)
                snt=snt+1;

        }return snt ;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=nhap();
        int []a=new int[n];
        System.out.println("nhap cac so nguyen");
        for (int i =0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("tong cac so chan la "+ tongCacsochan(a,n));
        System.out.println("tong cac so le la "+ tongCacsole(a,n));
        System.out.println("trong mang co "+ demSonguyento(a,n));
    }

}
