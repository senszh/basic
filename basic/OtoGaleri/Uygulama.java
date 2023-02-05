package OtoGaleri;

import OtoGaleri.OtoNode;

import java.util.Scanner;

public class Uygulama {
        OtoNode head=null;
        OtoNode tail=null;
        Scanner scanner=new Scanner(System.in);

        String model;
        String plaka;
        String marka;
        String renk;
        String aciklama;
        int alisFiyati;
        double satisFiyati=alisFiyati*12/10;

        void ekle() {
            System.out.println("plaka: "); plaka=scanner.nextLine();
            System.out.println("model: "); model=scanner.nextLine();
            System.out.println("marka: "); marka=scanner.nextLine();
            System.out.println(" renk: "); renk=scanner.nextLine();
            System.out.println("alis fiyati: "); alisFiyati=scanner.nextInt();

            scanner.nextLine();
            System.out.println("aciklama: "); aciklama=scanner.nextLine();

            OtoNode arac=new OtoNode(model,plaka,marka,renk,aciklama,alisFiyati);

            if (head==null) {
                head=arac;
                tail=arac;
                tail=head;
                System.out.println(plaka+" plakalı arac galeriye kaydedildi");
            } else  {
                arac.next=head;
                head=arac;
                tail=head;
            }
        }
        void sil() {
            if (head==null) {
                System.out.println("liste bos");
            }
            else  {
                System.out.println("satisini yaptiginiz aracin plakasi: "); plaka=scanner.nextLine();
                if (head==tail && head.plaka.equals(plaka)) {
                    head=null;
                    tail=null;
                    System.out.println(plaka+"plakali arac" +satisFiyati+"tl ye satildi");
                }
                else if (head!=tail && head.plaka.equals(plaka)) {
                    System.out.println(plaka+"plakali arac" +satisFiyati+"tl ye satildi");
                    head=head.next;
                    tail=head;
                }
                else {
                    OtoNode temp=head;
                    OtoNode temp2=temp;

                    while (temp!=tail) {
                        if (temp.plaka.equals(plaka)) {
                            temp2.next=temp.next;
                            System.out.println(plaka+"plakali arac" +satisFiyati+"tl ye satildi");
                        }
                        temp2=temp;
                        temp=temp.next;
                    }
                    if (temp.plaka.equals(plaka)) {
                        tail=temp2;
                        tail.next=head;
                        System.out.println(plaka+"plakali arac" +satisFiyati+"tl ye satildi");
                    }
                }
            }
        }
        void yazdir() {
            if (head==null) {
                System.out.println("liste bos");
            }
            else {
                System.out.println("plaka\t model\t marka\t renk\t alisfiyati\tsatisfiyati\taciklama");
                OtoNode temp=head;
                while (temp!=tail) {
                    System.out.println(temp.plaka+"\t"+temp.model+"\t"+temp.marka+"\t"+temp.renk+"\t"+temp.alisFiyati+"\t"+temp.satisFiyati+"\t"+temp.aciklama);
                    temp=temp.next;
                }
                System.out.println(temp.plaka+"\t"+temp.model+"\t"+temp.marka+"\t"+temp.renk+"\t"+temp.alisFiyati+"\t"+temp.satisFiyati+"\t"+temp.aciklama);
            }
        }
        void aracAra() {
            boolean sonuc=false;
            if (head==null) {
                System.out.println("liste bos");
            }
            else {
                System.out.println("arayacaginiz aracin plakasi"); plaka=scanner.nextLine();
                OtoNode temp=head;
                OtoNode temp2=head;
                while (temp!=tail) {
                    if (temp.plaka.equals(plaka)) {
                        temp2 = temp;
                    }
                    temp = temp.next;
                }
                if (temp.plaka.equals(plaka)) {
                    temp2=temp;
                    sonuc=true;
                }
                if (sonuc==false) {
                    System.out.println("aranan arac sistemde bulunamadı");
                }
                else {
                    System.out.println(plaka+"plakali arac bilgileri: ");
                    System.out.println("marka: "+temp2.marka);
                    System.out.println("model: "+temp2.model);
                    System.out.println("renk : "+temp2.renk);
                    System.out.println("markalis fiyati: "+temp2.alisFiyati);
                    System.out.println("satis fiyatı: "+temp2.satisFiyati);
                    System.out.println("aciklama: "+temp2.aciklama);
                }
            }
        }
    }


