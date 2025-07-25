import java.util.Scanner;

public class bai2 {
    public static final double pi=3.14159265;
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ban kinh r: ");
        double r=sc.nextDouble();
        System.out.print("nhap so mu k: ");
        int k=sc.nextInt();
        double chuVi=2*r*pi;
        double dienTich=r*r*pi;
        System.out.printf("chu vi va dien tich hinh tron la %.3f %.3f" , chuVi,dienTich);
        System.out.println();
        double canBachai=Math.sqrt(r+k);
        double luyThua=Math.pow(r,k);
        double giaTrituyetdoi=Math.abs(r-k);
        System.out.println("r mu k= "+ luyThua);
        System.out.println("can bac cua r+k= "+ canBachai);
        System.out.println("gia tri tuyet doi cua r-k= "+giaTrituyetdoi);





    }
}
