package baslangic;

import java.util.Scanner;

public class power {

        public static void main(String[] args) {
            // üs alma
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int sonuc=1;
            for (int i=1;i<=b;i++) {
                sonuc*=a;
            }
            System.out.println(sonuc);
        }
    }
