package baslangic;

import java.util.Scanner;
public class ispalindrom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String a="";
        boolean sonuc=false;

        for (int i = s.length() - 1; i >= 0; i--) {
            a += s.charAt(i);
        }
        if (s.equals(a)) {
            sonuc = true;
        }
        System.out.println(sonuc);
    }
}
