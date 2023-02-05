package datastructure;

public class hash {
    public static class Node {
        int numara;
        String ad;
        int ortalama;
        String durum;
        Node next;

        public Node(int numara, String ad, int ortalama) {
            this.numara = numara;
            this.ad = ad;
            this.ortalama = ortalama;
            this.durum = ortalama<50 ? "kaldı " : "geçti";
            next=null;
        }

        public Node() {
        }
    }
    public static class Tablo {
        Node dizi[];
        int size;
        public Tablo(int size){
            this.size=size;
            dizi=new Node[size];
            for (int i=0;i<size;i++) {
                dizi[i]=new Node();
            }
        }
        int indisUret(int numara){
            return numara%size;
        }
        void ekle(int numara,String ad,int ortalama) {
            int indis=indisUret(numara);
            Node ogr=new Node(numara,ad,ortalama);
            Node temp=dizi[indis];
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=ogr;
            System.out.println(ad+" eklendi");
        }
        void sil(int numara){
            int indis=indisUret(numara);
            Node temp=dizi[indis];
            Node temp2=temp;
            Boolean sonuc=true;
            if (temp.next!=null) {   //YAPILAN TABLODA ELEMAN YOKSA
                sonuc=true;
                System.out.println(numara+ "numarali öğrenci yok");
            }
            else if (temp.next.next!=null) {        //TEK ELEMAN VARSA
                sonuc=true;
                temp.next=null;
                System.out.println(numara+" numaralı öğrenci silindi");
            }
            else {
                while (temp.next!=null){        //ELEMANLAR VAR VE SİLME HERHANGİ Bİ YERDEN
                    temp2=temp;
                    temp=temp.next;
                    if (temp.numara==numara){
                        sonuc=true;
                        temp2.next=temp.next;
                        System.out.println(numara+" numaralı öğrenci silindi");
                    }
                }
            }
            if (sonuc==false){
                System.out.println(numara+" numaralı öğrenciye ulaşılamadı");
            }
        }
        void yazdir() {
            for (int i=0;i<size;i++) {
                Node temp=dizi[i];
                while (temp.next!=null){
                    System.out.println(temp.next.numara+"\t"+temp.next.ad+"\t"+temp.next.ortalama+"\t"+temp.next.durum);
                    temp=temp.next;
                }
            }
        }
        void ara(int numara){
            boolean sonuc=false;
            int indis=indisUret(numara);
            Node temp=dizi[indis];
            while (temp.next!=null){
                if (temp.next.numara==numara){
                    sonuc=true;
                    System.out.println(numara+" numarali öğrenci bilgileri");
                    System.out.println("Ad: "+temp.ad);
                    System.out.println("Ortalama    : "+temp.ortalama);
                    System.out.println("Durum: "+temp.durum);
                    break;
                }
                temp=temp.next;
            }
            if (sonuc==false){
                System.out.println(numara+" numarali öğrenci bulunamadı");
            }
        }
    }
    public class Main {
        public static void main(String[] args) {
            Tablo t=new Tablo(5);
            t.ekle(15,"sena",45);
            t.ekle(16,"ali",60);
            t.ekle(17,"veli",12);

            t.yazdir();
        }
    }
}
