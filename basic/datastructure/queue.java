package datastructure;

public class queue {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data=data;
            next=null;
        }

    }
    public static class queuell {
        Node front; // head
        Node rear;  // tail
        int cnt;
        int size;

        queuell(int size) {
            this.size=size;
            front=null;
            rear=null;
            cnt=0;
        }

        void enQueue(int data) {
            if (isFull()) {
                System.out.println("dolu ekleme yapılamaz");
            }
            else {
                Node eleman=new Node(data);
                if (isEmpty()) {
                    front=eleman;
                    rear=eleman;
                    System.out.println(data+" kuyruğa ilk eleman olarak eklendi");
                }
                else {
                    rear.next=eleman;
                    rear=rear.next;
                    System.out.println(data+" kuyruğa eklendi");
                }
                cnt++;
            }
        }

        void deQueue() {
            if (isEmpty()) {
                System.out.println("kuyruk boş silme yapılamaz");
            }
            else {
                front=front.next;
                System.out.println(front.data+" silindi");
                cnt--;
            }
        }

        void print() {
            if (isEmpty()) {
                System.out.println("kuyruk bos ");
            }
            else {
                Node temp=front;
                System.out.print("bas-->");
                while (temp!=null){
                    System.out.print(temp.data+"-->");
                    temp=temp.next;
                }
                System.out.println("son");
            }
        }

        private boolean isEmpty() {
            return cnt==0;
        }

        private boolean isFull() {
            return cnt==size;
        }
    }
    public class Main {
        public static void main(String[] args) {
            queuell q=new queuell(5);
            q.enQueue(10);
            q.enQueue(20);
            q.enQueue(30);
            q.enQueue(40);
            q.enQueue(50);
            q.enQueue(60);
            System.out.println("kuyruğun basindaki eleman "+q.front.data);
            System.out.println("kuyruğun sonundaki eleman "+q.rear.data);
            System.out.println("kuyruğun eleman sayisi "+q.cnt);
            q.print();
        }
    }
}
