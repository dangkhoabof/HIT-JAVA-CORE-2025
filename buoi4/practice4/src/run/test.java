package run;

import backround.book;

import java.util.Scanner;

public class test {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        book b = new book("10 van dam duoi bien", "khong nho");
        b.disPlayInfo();
        System.out.println("nhap ten quyen sach mmoi ");
        String newb= sc.nextLine();
        b.setTitle(newb);
        b.disPlayInfo();
    }
}
