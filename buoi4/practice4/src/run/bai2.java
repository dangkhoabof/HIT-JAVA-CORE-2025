package run;


import backround.student;

import java.util.Scanner;

public class bai2{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        student s = new student("khoa",18);
        s.sayHello();
        System.out.println("nhapj ten moi ");
        String newName= sc.nextLine();
        s.setName(newName);
        s.sayHello();
    }

}