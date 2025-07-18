import java.util.Scanner;

public class bai1 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("tên của bạn là gì ");
        String name = sc.nextLine();
        System.out.print("bạn bao nhiêu tuổi ");
        int age = sc.nextInt();
        System.out.print("bạn cao bao nhiêu ");
        double high = sc.nextDouble();
        System.out.println("Xin chào "+ name);
        System.out.println("bạn "+ age);
        System.out.println("bạn cao "+ high);

    }
}
