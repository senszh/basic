package datastructure;

import java.util.Scanner;

public class sorts {
        public static void bubbleSort(int dizi[],int n){
            for (int i=0;i<n;i++){
                for (int j=0;j<n-i-1;j++){         //N-İ-1 EN BÜYÜK ELEMANI SONA ATTIKTAN SONRA TEKRAR KONTROL ETMEMEK İÇİN
                    if (dizi[j]>dizi[j+1]){
                        int gecici=dizi[j];       //SAYILARI KARŞILAŞTIRIP YER DEĞİŞTİRME
                        dizi[j]=dizi[j+1];
                        dizi[j+1]=gecici;           //EN BAŞTAKİNİ SIRAYLA  HEPSİYLE KARŞILAŞTIRIP
                        //SONA ATMA ŞEKLİNDE
                    }
                }
            }
        }
        public static void insertionSort(int dizi[],int n){
            for (int i=0;i<n;i++){
                for (int j=i;j>0;j--){
                    if (dizi[j]<dizi[j-1]){
                        int temp=dizi[j];
                        dizi[j]=dizi[j-1];
                        dizi[j-1]=temp;
                    }
                }
            }
        }
    public static void selectionSort(int dizi[],int n){
        for (int i=0;i<n-1;i++){
            int min=i;                  //en küçüğün indisini bulup tutma
            for (int j=i;j<n;j++){
                if(dizi[min]>dizi[j]){
                    min=j;               //değerlere bakıldıktan sonra yer değiştirmeden önce en küçüğü tutup
                }                       //başka en küçük var mı diye indisi tutmak
            }
            int temp=dizi[min];         //sıralama işlemi
            dizi[min]=dizi[i];
            dizi[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("sayı adedini giriniz: ");  n=scanner.nextInt();
        int dizi[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("sayı: ");
            dizi[i]=scanner.nextInt();
        }
        bubbleSort(dizi,n);

        System.out.println("bubble sort ile sıralama işlemi yapıldı");
        for (int m=0;m<n;m++){
            System.out.print(dizi[m]+" ");
        }
        Scanner scanner2=new Scanner(System.in);
        System.out.print("sayı adedi girin: "); int n2=scanner.nextInt();
        int dizi2[]=new  int[n2];
        for (int i=0;i<n2;i++){
            System.out.print("sayı: "); dizi[i]=scanner.nextInt();
        }
        insertionSort(dizi,n);
        for (int i=0;i<n;i++){
            System.out.print(" "+dizi[i]);
        }
        Scanner scanner3=new Scanner(System.in);
        System.out.print("sayı adedi giriniz: "); int n3 =scanner.nextInt();
        int dizi3[]=new int[n3];
        for (int i = 0; i< n3; i++){
            System.out.print("sayı: "); dizi[i]=scanner.nextInt();
        }
        selectionSort(dizi, n3);
        System.out.println("sıralama tamamlandı");
        for (int i = 0; i< n3; i++){
            System.out.print(dizi[i]+" ");
        }
    }
}
