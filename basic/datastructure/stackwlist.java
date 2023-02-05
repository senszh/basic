package datastructure;

public class stackwlist {
    public class Node {
        Node next;
        int data;
        Node(int data) {
            this.data=data;
            next=null;
        }
    }

    public class stackwlinked {
        int size;
        int counter;
        Node top;

        stackwlinked(int size){
            this.size=size;
            counter=0;
            top=null;
        }
        void push(int data) {
            Node variable=new Node(data);
            if (isFull()) {
                System.out.println("stack is full");
            }
            else {
                if (isEmpty()) {
                    top=variable;
                    System.out.println(top.data+"  is added to stack");
                }
                else {
                    variable.next=top;
                    top=variable;
                    System.out.println(top.data+"  is added to stack");
                }
                counter++;
            }
        }
        void pop() {
            if (isEmpty()) {
                System.out.println("stack is empty");
            }
            else {
                System.out.println("data is erased");
                top=top.next;
                counter--;
            }
        }
        void printf() {
            if (isEmpty()) {
                System.out.println("data not found");
            }
            else {
                Node temp=top; // temp=head;
                while (temp!=null) {
                    System.out.println(temp.data);
                    temp=temp.next;
                }
                System.out.println("\n");
            }
        }
        void showTop() {
            if (isEmpty()){
                System.out.println("stack is empty");
            }
            else {
                System.out.println(top.data);
            }
        }
        boolean isFull() {
            return counter==size;
        }
        boolean isEmpty() {
            return counter==0;
        }
    }

}
