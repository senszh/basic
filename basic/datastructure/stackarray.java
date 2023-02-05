package datastructure;

public class stackarray {
    public class Stack {
        int array[];
        int size;
        int indis;

        Stack(int size) {
            this.size=size;
            array=new int[size]; //dizi boyutunu ayarlama
            indis=-1;
        }
        void push(int data) {
            if (isFull()) {
                System.out.println("stack is full you mustnt adding");
            }
            else {
                indis++; // indisin eksi değerini düzeltme
                array[indis]=data;
                System.out.println("pushing data : " +data );
            }
        }
        int pop() {
            if (isEmpty()) {
                return (array[indis--]);
            }
            else {
                System.out.println("stack is empty");
                return -1; // int tanımlamada return sağlama
            }
        }
        boolean isFull() {
            return (indis==size-1);
        }
        boolean isEmpty() {
            return (indis==-1);
        }
    }

}
