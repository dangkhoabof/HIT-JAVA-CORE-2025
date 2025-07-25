import java.util.Scanner;

public class bai2 {
    public static String nhap(){
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        return a;
    }
    public static boolean kiemtra(String a){
         String chuoiMoi="";
        for (int i=a.length()-1;i>=0;i--){
            chuoiMoi+= a.charAt(i);
        }

        if (chuoiMoi.equalsIgnoreCase(a))
            return true;

        else
            return false;


    }

    public static void main(String[] args) {
        System.out.println("nhap chuoi ");
        String a=nhap();
        if (kiemtra(a))
            System.out.println(a.toUpperCase()+" la chuoi doi xung");
        else
            System.out.println(a.toLowerCase()+" khong la chuoi doi xung");

    }
}
