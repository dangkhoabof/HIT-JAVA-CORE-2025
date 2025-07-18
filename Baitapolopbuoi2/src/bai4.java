import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu cua mang: ");
        int b=sc.nextInt();
        int[] mang = new int[b];
        int i;
        for (i = 0; i < b; i++){
            System.out.print("phan tu thu "+(i+1)+": ");
            mang[i]=sc.nextInt();}
        System.out.println("cac phan tu vua nhap la ");
        for (i = 0; i < b; i++){
            System.out.print("phan tu thu "+(i+1)+": ");
            System.out.println(mang[i]);}
        int tong=0;
        for (i = 0; i < b-1; i++)
            tong = tong + mang[i];
        System.out.println("tong cua cac phan tu trong mang la "+(tong));
        int max=mang[0];
        for (i = 0; i < b-1; i++)
            if(mang[i]<mang[i+1]){
                max=mang[i+1];
            }
        System.out.println("phan tu lon nhat la "+(max));







    }
}
