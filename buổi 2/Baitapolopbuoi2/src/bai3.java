import java.util.Scanner;

public class bai3 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen a ");
        int a=sc.nextInt();
        System.out.print("nhap so nguyen b ");;
        int b=sc.nextInt();
        int sum=a+b;
        int hieu=a-b;
        double tich= a*b;
        double thuong=a/b;
        double du=a%b;
        System.out.println("a+b= "+ (a+b));
        System.out.println("a-b= "+ (a-b));
        System.out.println("a*b= "+ (a*b));
        System.out.println("a/b= "+ (a/b));
        System.out.println("a%b= "+ (a%b));
       if(a==b)
           System.out.println("a bang b");
       if (sum==hieu)
           System.out.println("tong bang hieu");
       if (sum==tich)
           System.out.println("tong bang tich");
       if (sum==thuong)
           System.out.println("tong bang  thuong");
       if (sum==du)
           System.out.println("tong bang du");
       if (hieu==tich)
           System.out.println("hieu bang tich");
       if (hieu==thuong)
           System.out.println("hieu bang thuong");
       if (hieu==du)
           System.out.println("hieu bang du");
       if (tich==thuong)
           System.out.println("tich bang thuong");
       if (tich==du)
           System.out.println("tich bang du");
       if (thuong==du)
           System.out.println("thuong bang du");





    }
}
