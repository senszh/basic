package datastructure;

import java.util.Scanner;

public class list {
    public static class Node {
        int data;
        Node next;
    }
    public static class ListeYapisi {
        Node head=null;
        Node tail=null;

        void basaEkle(int x){
            Node eleman =new Node();
            if(head==null){
                eleman.next=null;
                head= eleman;
                tail= eleman;
            }
            else {
                eleman.next=head;
                head= eleman;
            }
        }
        void arayaEkle(int indis ,int x){
            Node eleman=new Node(); //EKLENECEK OLAN DUGUM
            eleman.data=x;
            eleman.next=null;

            if (head==null && indis==0){
                head=eleman;
                tail=eleman;
                System.out.println("liste olusturuldu ve ilk dugum eklendi");
            }
            else if (head!=null && indis==0){
                eleman.next=head;
                head= eleman;
                System.out.println(indis+ "indisinci sıraya yeni eleman eklendi");
            }
            else {
                int n=0;
                Node temp=head;
                Node temp2=head;
                while (temp.next!=null){
                    n++;
                    temp2=temp;
                    temp=temp.next;
                }
                if(n==indis){
                    temp2.next=eleman;
                    System.out.println("eleman eklendi");
                }
                else{
                    temp=head;
                    temp2=head;
                    int i=0;
                    while (i!=indis){
                        temp2=temp;
                        temp=temp.next;
                        i++;
                    }
                    temp2.next=eleman;
                    eleman.next=temp;
                    System.out.println(indis+".ci sıraya yeni eleman eklendi");
                }
            }
        }
        void sonaEkle(int x){
            Node eleman =new Node();
            if(head==null){
                eleman.next=null;
                head= eleman;
                tail= eleman;
            }
            else{
                tail.next= eleman;
                tail= eleman;
            }
        }
        void bastanSil() {
            if(head==null){
                System.out.println("silinecek veri yok");
            }
            else if(head.next==null){
                head=null;
                tail=null;
                System.out.println("tek veri de silindi");
            }
            else {
                head=head.next;
                System.out.println("ilk veri silindi ");
            }
        }
        void sondanSil() {
            if (head==null) {
                System.out.println("silinecek veri yok");
            }
            else if(head.next==null) {
                System.out.println("eleman silindi");
            }
            else {
                Node temp=head;
                Node temp2=head;
                while (temp.next!=null){
                    temp2=temp;
                    temp=temp.next;
                }
                temp2.next=null;
                tail=temp2;
            }
        }
        void aradanSil(int indis){
            if(head==null){
                System.out.println("eleman yok");
            }
            else if(head!=null && indis==0){
                head=null;
                tail=null;
                System.out.println("listedeki eleman silindi");
            }
            else if (head.next!=null && indis==0) {
                head.next=head;
                System.out.println("bastaki eleman silindi");
            }
            else{
                int i=0;
                Node temp=head;
                Node temp2=head;
                while (temp!=null){
                    i++;
                    temp2=temp;
                    temp=temp.next;
                }
                if(i==indis){
                    temp2.next=null;
                    tail=temp2;
                    System.out.println("listedeki son sıradaki eleman silindi");
                }
                else{
                    temp=head;
                    temp2=head;
                    int j=0;
                    while (j!=indis){
                        temp2=temp;
                        temp=temp.next;
                        j++;
                    }
                    temp2.next=temp.next;
                    System.out.println("aradaki eleman silindi");
                }
            }
        }
        void yazdir() {
            if (head==null){
                System.out.println("liste bostur");
            }
            else{
                Node temp=head;
                while (temp!=null){
                    System.out.print(temp.data+"-->");
                    temp=temp.next;
                }
                System.out.println("finish");
            }
        }
    }
        public static void main(String[] args) {
            ListeYapisi liste= new ListeYapisi();
            Scanner scanner=new Scanner(System.in);
            int secim=0,indis,sayi;
            while (true){
                System.out.println("1.Basa ekle");
                System.out.println("2.Sona ekle");
                System.out.println("3.Araya ekle");
                System.out.println("4.Bastan sil");
                System.out.println("5.Sondan sil");
                System.out.println("6.Aradan sil");
                System.out.println("0-->CIKIS");
                System.out.println("ISLEM NUMARANIZI SECİNİZ");
                secim=scanner.nextInt();

                if(secim==1){
                    System.out.print("basa eklemek istediginiz sayi: ");
                    sayi=scanner.nextInt();
                    liste.basaEkle(sayi);
                }
                else if(secim==2){
                    System.out.print("sona eklemek istediginiz sayi: ");
                    sayi=scanner.nextInt();
                    liste.sonaEkle(sayi);
                }
                else if (secim==3) {
                    System.out.print("araya eklemek istediginiz indis: ");
                    indis=scanner.nextInt();
                    System.out.print("araya eklemek istediginiz sayi: ");
                    sayi=scanner.nextInt();
                    liste.arayaEkle(indis,sayi);
                }
                else if (secim==4) {
                    liste.bastanSil();
                }
                else if (secim==5) {
                    liste.sondanSil();
                }
                else if(secim==6){
                    System.out.println("silmek istediginiz indis");
                    indis=scanner.nextInt();
                    liste.aradanSil(indis);
                } else if (secim==0) {
                    System.out.println("islem sonlandırıldı");
                } else {
                    System.out.println("hatali giris!!");
                }
                liste.yazdir();
            }
        }

}