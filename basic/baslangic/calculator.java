package baslangic;

import java.util.Scanner;

public class calculator {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int secim=-1;

            while (secim!=0) {
                System.out.println("1-Toplama");
                System.out.println("2-Cıkarma");
                System.out.println("3-Carpma");
                System.out.println("4-Bolme");
                System.out.println("yapmak istediginiz islemi seciniz: ");
                secim=scanner.nextInt();
                System.out.println("islem yapılacak a ve b sayılarını giriniz");
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                int top=a+b;
                int fark=a-b;
                int carp=a*b;
                int bol=a/b;

                switch (secim) {
                    case 1:
                        System.out.println("sonuc: "+top);
                        break;
                    case 2:
                        System.out.println("sonuc: "+fark);
                        break;
                    case 3:
                        System.out.println("sonuc: "+carp);
                        break;
                    case 4:
                        System.out.println("sonuc: "+bol);
                        break;
                    default:
                        System.out.println("hatali secim yaptiniz (1-4)");
                }
            }
        }
    }


