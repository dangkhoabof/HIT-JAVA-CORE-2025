import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bang cua chuong 5 ");
        for (int i = 1; i <= 10; i++)
            System.out.println("5x" + (i) + "= " + (5 * i));
        int tong=0;
        for(int i=1;i<=100;i++){
            if(i%2==0)
                tong=tong+i;
        }
        System.out.println("tong cac so chan tu 1 den 100 la "+ (tong));

    }
}

