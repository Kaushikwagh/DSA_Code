//import java.util.Queue;
// 1. Queue using array
//public class J_Queue_10 {
//    static class Queue {
//        static int arr[];
//        static int size;
//        static int rear = -1;
//
//        Queue(int n) {
//            arr = new int[n];
//            this.size = n;
//        }
//        public static boolean isEmpty(){
//            return rear == -1;
//        }
//    // add function -> enqueue
//        public static void add(int data){
//            // Queue is full then we cannot add element
//            if(rear == size-1){
//                System.out.println("full queue");
//                return;
//            }
//            // increase rear for adding in queue
//            rear++;
//            arr[rear] = data;
//        }
//    // remove element -> dequeue
//        public static int remove(){
//        // if queue is empty then
//            if(isEmpty()){
//                System.out.println("Empty queue");
//                return -1;
//            }
//            // to remove now from index
//            int front = arr[0];
//            // now shift element
//            for(int i=0; i<rear; i++){
//                arr[i] = arr[i+1];
//            }
//            rear--;
//            return front;
//        }
//    // peek operation-> to check element of queue
//        public static int peek(){
//            if(isEmpty()){
//                System.out.println("Empty queue");
//                return -1;
//            }
//            return arr[0];
//        }
//    }
//
//    public static void main(String[] args){
//        Queue q = new Queue(5);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}

// 2. queue using linked list
//public class J_Queue_10{
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            next = null;
//        }
//    }
//    static class Queue{
//        static Node head = null;
//        static Node tail = null;
//        public static boolean isEmpty(){
//            return head == null && tail == null;
//        }
//        public static void add(int data){
//            Node newNode = new Node(data);
//            if(isEmpty()){
//                tail = head = newNode;
//            } else{
//                tail.next = newNode;
//                tail = newNode;
//            }
//        }
//        public static int remove(){
//            if(isEmpty()){
//                System.out.println("empty queue");
//                return -1;
//            }
//            int front = head.data;
//            //single node
//            if(head == tail) {
//                tail = null;
//            }
//            head = head.next;
//            return front;
//        }
//        public static int peek() {
//            if (isEmpty()) {
//                System.out.println("empty queue");
//                return -1;
//            }
//
//            return head.data;
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue q = new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//
//
//        while(!q.isEmpty()) {
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}

// 3. queue using Java Collection Framework
import java.util.Queue;
import java.util.ArrayDeque;
class J_Queue_10{
    public static void main(String[] args){
        Queue<Integer> q = new ArrayDeque();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}