// // Code Stack using Linked-list
//public class I_Stack_09 {
//    static class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            next = null;
//        }
//    }
//    static class Stack{
//        Node head;
//
//        public boolean isEmpty() {
//            return head == null;
//        }
//
//        public void push(int data){
//            Node newNode = new Node(data);
//            if(isEmpty()){
//                head = newNode;
//            } else {
//                newNode.next = head;
//                head = newNode;
//            }
//        }
//        public int pop() {
//            if (isEmpty()) {
//                return -1;
//            }
//            int top = head.data;
//            head = head.next;
//            return top;
//        }
//        public int peek() {
//            if (isEmpty()) {
//                return -1;
//            }
//            return head.data;
//        }
//    }
//    public static void main(String[] args){
//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}



// Code Stack using ArrayList
//import java.util.ArrayList;
//class I_Stack_09{
//    static class Stack{
//        static ArrayList<Integer> list = new ArrayList<>();
//        public static boolean isEmpty(){
//            return list.size() == 0;
//        }
//        public static void push(int data){
//            list.add(data);
//        }
//        public static int pop(){
//            int top = list.get(list.size()-1);
//            list.remove(list.size()-1);
//            return top;
//        }
//        // list.size()-1 use to get last index of list
//        public static int peek(){
//            if(isEmpty()){
//                return -1;
//            }
//            return list.get(list.size()-1);
//        }
//    }
//    public static void main(String[] args){
//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        while(!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}

// code stack using collection framework
//import java.util.Stack;
//class I_Stack_09{
//    public static void main(String[] args){
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        while(!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}

// Q> Push at the bottom of stack
import java.util.Stack;
class I_Stack_09{
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    // To print reverse stack
    //    public static void reverse(Stack<Integer> s){
    //        if(s.isEmpty()){
    //            return;
    //        }
    //        int top = s.pop();
    //        reverse(s);
    //        pushAtBottom(top, s);
    //    }
    public static void main(String[] args){

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        pushAtBottom(4,s);
        // reverse(s);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}