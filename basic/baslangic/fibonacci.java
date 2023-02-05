package baslangic;

public class fibonacci {
        public static void main(String[] args) {
            // 1 1 2 3 5 8 13
            int a=0;
            int b=1,c;
            for (int i=2;i<12;i++) {
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
            }
        }
    }
