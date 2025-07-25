import javax.swing.plaf.synth.SynthIcon;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot chuoi");
        String chuoi = sc.nextLine();
        if (chuoi.startsWith("Hello"))
            System.out.println("chuoi bat dau voi Hello");
        else
            System.out.println("chuoi khong bat dau voi Hello");
        if (chuoi.endsWith("!"))
            System.out.println("chuoi ket thuc voi !");
        else
            System.out.println("chuoi khong ket thuc voi !");
        String[] words =chuoi.split(" ");
        int sotu=words.length;
        System.out.println("so tu: "+sotu);
        String max=words[0];
        for (String tu:words)
            if (tu.length()>max.length())
                max=tu;
        System.out.println("tu dai nhat la "+max);
        String chuoi2=chuoi.replace("a" ,"@").replace("A","@");
        System.out.println(chuoi2);
    }
}
