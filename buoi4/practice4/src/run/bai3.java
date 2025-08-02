package run;
import backround.Car;
public class bai3 {
    public static void main(String[] args) {
        Car c= new Car("bwm",80);
        c.run();
        if (c.kiemTra())
            System.out.println("xe khong chay vuot qua toc do cho phep");
        else
            System.out.println("xe chay qua toc do cho phep");
    }
}
