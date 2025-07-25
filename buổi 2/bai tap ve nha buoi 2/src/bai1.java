import java.util.Scanner;

public class bai1 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double r;
        do {
            System.out.print("nhap ban kinh r: ");
            r = sc.nextDouble();
            if (r <= 0 || r >= 1000)
                System.out.println("Bán kính phải lớn hơn 0 và nhỏ hơn 1000.");

        } while (r <= 0 || r >= 1000);
        double pi=3.14;
        double chuVi=2*r*pi;
        double dienTich=pi*r*r;
        System.out.printf("chu vi va dien tich hinh tron la: %.3f %.3f",chuVi,dienTich);


    }
}
