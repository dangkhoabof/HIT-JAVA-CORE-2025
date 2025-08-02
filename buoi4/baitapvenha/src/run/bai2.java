package run;
import backround.Student;
import backround.Student2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class bai2 {
    static Scanner sc=new Scanner(System.in);
    public static void themSinhVien(ArrayList<Student2> list){
        System.out.println("ten ");
        String name = sc.nextLine();
        System.out.println("nam sinh ");
        int birthYear = sc.nextInt();
        sc.nextLine();
        System.out.println("dia chi ");
        String address = sc.nextLine();
        System.out.println("tx1 ");
        double tx1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("tx2 ");
        double tx2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("KTHP ");
        double KTHP = sc.nextDouble();
        sc.nextLine();
        System.out.println("vang ");
        int vang = sc.nextInt();
        sc.nextLine();
        list.add(new Student2(name, birthYear, address, tx1, tx2, vang, KTHP));
    }
    public static void suaThongtin(ArrayList<Student2> list) {
        System.out.println("nhap ten sinh vien can sua ");
        String ten = sc.nextLine();
        for (Student2 sv : list) {
            if (sv.getName().trim().equalsIgnoreCase(ten)) {
                System.out.print("Tên mới: ");
                sv.setName(sc.nextLine());
                System.out.print("Năm sinh mới: ");
                sv.setBirthYear(sc.nextInt());
                sc.nextLine();
                System.out.print("Địa chỉ mới: ");
                sv.setAddDress(sc.nextLine());
                System.out.print("TX1 mới: ");
                sv.setTx1(sc.nextDouble());
                System.out.print("TX2 mới: ");
                sv.setTx2(sc.nextDouble());
                System.out.print("KTHP mới: ");
                sv.setKTHP(sc.nextDouble());
                System.out.print("Số tiết nghỉ mới: ");
                sv.setNghi(sc.nextInt());
                break;
            }
        }
    }
    public static void xepTuoi(ArrayList<Student2> list){
        list.sort(Comparator.comparingInt(Student2::getAge));
        System.out.println("da xep");
    }
    public static void xepGPA(ArrayList<Student2> list){
        list.sort(Comparator.comparingDouble(Student2::getGPA));
        System.out.println("da sap xep");
    }
    public static void xepNghi(ArrayList<Student2> list){
        list.sort(Comparator.comparingInt(Student2::getNghi));
        System.out.println("da sap xep");
    }
    public static void xoa(ArrayList<Student2> list){
        System.out.println("nhap ten sinh vien");
        String tenSv=sc.nextLine();
        for (Student2 sv:list) {
            if (sv.getName().equalsIgnoreCase(tenSv))
                list.remove(sv);
        }
    }
    public static void hienThi(ArrayList<Student2> list) {
        System.out.printf("%-8s%-8s%-12s%-8s%-8s%-8s%-8s%-8s\n","ten","tuoi","dia chi","tx1","tx2","KTHP","GPA","vang");
        for (Student2 sv:list){
            sv.display();}
    }


    public static void main(String[] args) {

        ArrayList<Student2> list= new ArrayList<>();
        list.add(new Student2("khoa",2006,"ca mau",8.5,7.0,0,7));
        list.add(new Student2("nguyen",2004,"ha noi",7.8,6,2,7));
        list.add(new Student2("bof",2005,"ha nam",10,9,0,8));
        list.add(new Student2("manh",2005,"lao cai",8.5,7.0,0,6));
        list.add(new Student2("huy",2006,"an giang",5,5,3,6.7));


        while (true){
            System.out.println("-------MENU-------");
            System.out.println("1. thêm sinh viên mới");
            System.out.println("2. sửa thông tin sinh viên");
            System.out.println("3. sắp xếp sinh viên theo tuổi");
            System.out.println("4. sắp xếp sinh viên theo gpa");
            System.out.println("5. sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6. xóa sinh viên khỏi danh sách");
            System.out.println("7. in danh sach sinh vien");
            System.out.println("0.thoát ");
            System.out.println("chon ");
            int chose= sc.nextInt(); sc.nextLine();
            switch (chose) {
                case 1 -> {
                    themSinhVien(list);
                    System.out.println("enter de tiep tuc");
                    sc.nextLine();
                }
                case 2 ->{
                    suaThongtin(list);
                    System.out.println("enter de tiep tuc");
                    sc.nextLine();
                }
                case 0 -> {
                    return;
                }
                case 3->{
                    xepTuoi(list);
                    System.out.println("enter de tiep tuc");
                    sc.nextLine();
                }


                case  4->{
                    xepGPA(list);
                    System.out.println("enter de tiep tuc");
                    sc.nextLine();
                }



                case 5->{
                    xepNghi(list);
                    System.out.println("enter de tiep tuc");
                    sc.nextLine();
                }


                case 6->{
                    xoa(list);
                    System.out.println("enter de tiep tuc");
                    sc.nextLine();
                }


                case 7->{
                    hienThi(list);
                    System.out.println("enter de tiep tuc");
                    sc.nextLine();
                }


            }
        }
    }
}
