package OtoGaleri;

import java.util.Scanner;

public class otomasyon {
        public static void main(String[] args) {
            Uygulama app=new Uygulama();
            Scanner scanner=new Scanner(System.in);
            int secim=-1;
            while (secim!=0) {
                System.out.println("1-sisteme ekle");
                System.out.println("2-sistemden sil");
                System.out.println("3-arac ara");
                System.out.println("4-yazdir");
                System.out.println("0-cikis");
                System.out.println("seciminiz: ");   secim=scanner.nextInt();


                switch (secim) {
                    case 1:
                        app.ekle();
                        break;
                    case 2:
                        app.sil();
                        break;
                    case 3:
                        app.aracAra();
                        break;
                    case 4:
                        app.yazdir();
                        break;
                    default:
                        System.out.println("hatali secim (1-4)");
                }
            }
        }
    }

