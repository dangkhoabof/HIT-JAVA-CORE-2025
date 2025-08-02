package run;

import backround.Student;

public class bai1 {
    public static void main(String[] args) {
        Student s1= new Student("khoa ",2006,"ca mau",8.5,7.0,0,7);
        Student s2= new Student("nguyen ",2006,"ha noi",7.8,6,2,7);
        Student s3= new Student("bof ",2006,"ha nam",10,9,0,8);
        Student s4= new Student("manh ",2006,"lao cai",8.5,7.0,0,6);
        Student s5= new Student("huy ",2006,"an giang",5,5,3,6.7);
        System.out.printf("%-8s%-8s%-12s%-8s%-8s%-8s%-8s%-8s\n","ten","tuoi","dia chi","tx1","tx2","KTHP","GPA","vang");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();

    }

}