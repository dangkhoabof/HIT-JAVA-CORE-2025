import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class bai1 {
    public static final String Square="square";
    public static final String triangel="triangel";
    public static final String circle="circle";
    public  static  void vuong() {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap canh hinh vuong: ");
        double a= sc.nextDouble();
        System.out.println("dien tich cuc gach hinh vuong la: "+(a*a));

    }
    public static void tamGiac(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap 3 canh cua tam giac ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double p=(a+c+b)/2;
        double S=p*(p-a)*(p-b)*(p-c);
        System.out.println("dien tich cua vien gach hinh tam giac la: "+ Math.sqrt(S));
    }
    public static void  hinhTron(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ban kinh r: ");
        double r=sc.nextDouble();
        System.out.println("dien tich cua vien gach hinh trong la: "+ Math.PI*r*r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập loại hình (square, triangle, circle):");
        String nhap =sc.nextLine();
        switch (nhap){
            case Square:
                vuong();
                break;
            case triangel:
                tamGiac();
                break;
            case circle:
                hinhTron();
                break;
        }

    }
}
