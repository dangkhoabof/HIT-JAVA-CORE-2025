import java.util.Scanner;

public class bai2 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("tên của bạn là gì ");
        String Tên=sc.nextLine();
        System.out.print("bạn bao nhiêu tuổi   ");
        int Tuổi=sc.nextInt();
        System.out.print("GPA= ");
        double GPA=sc.nextDouble();
        System.out.println("Tên: "+Tên +" Tuổi: "+Tên + " GPA: "+ GPA);
    }
}
