import java.util.Scanner;

public class bai4 {
    public static int daySo (int n){
        if (n<=1)
            return n;
        else return daySo(n-1)+daySo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tong=0;
        int n=sc.nextInt();
        for (int i=0; i<=n;i++){
            System.out.println(daySo(i));
            if (daySo(i)%2!=0)
                tong=tong+daySo(i);

        }
        System.out.println("tong cac so le trong day la "+ tong);

    }
}
