public class B_LinkedList_02 {
    class node{
        String data;
        node prev;
        node next;
        node(String data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    class linklist {
        node head;
        private int size;

        linklist() {
            size = 0;
        }

        public void addFirst(String data) {
            node newNode = new node(data);
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            size++;
        }

        public void addLast(String data) {
            node newNode = new node(data);
            if (head == null) {
                head = newNode;
            } else {
                node lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = newNode;
                newNode.prev = lastNode;
            }
            size++;
        }

        public void printList() {
            node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println("null");
        }

        public void removeFirst() {
                if (head == null) {
                    System.out.println("Empty List, nothing to delete");
                    return;
                }

                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
                size--;
            }

            public void removeLast() {
                if (head == null) {
                    System.out.println("Empty List, nothing to delete");
                    return;
                }

                node lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }

                if (lastNode.prev != null) {
                    lastNode.prev.next = null;
                } else {
                    // If only one element in the list
                    head = null;
                }
                size--;
            }



            public int getSize() {
            return size;
        }
        public void addinMiddle(int index, String data) {
            if (index > size || index < 0) {
                System.out.println("Invalid");
                return;
            }
            size++;
            node newNode = new node(data);
            if (head == null || index == 0) {
                newNode.next = head;
                if (head != null) {
                    head.prev = newNode;
                }
                head = newNode;
                return;
            }
            node currentNode = head;
            for (int i = 1; i < size; i++) {
                if (i == index) {
                    node nextNode = currentNode.next;
                    currentNode.next = newNode;
                    newNode.prev = currentNode;
                    newNode.next = nextNode;
                    if (nextNode != null) {
                        nextNode.prev = newNode;
                    }
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
        // Reverse Doubly Linked List
        public node reverseList(node head) {
            node current = head;
            node temp = null;

            while (current != null) {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.prev;
            }

            if (temp != null) {
                head = temp.prev;
            }

            return head;
        }
    public static void main(String[] args){
        B_LinkedList_02 LL = new B_LinkedList_02();
        linklist list = LL.new linklist();

        // To add data in list
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.addLast("...");

        list.addFirst("this");
        System.out.print("To print Data added in list    :- ");
        list.printList();

        System.out.print("The Size of list is            :- ");
        System.out.println(list.getSize());

        list.removeFirst();
        System.out.print("Remove First                   :- ");
        list.printList();

        list.removeLast();
        System.out.print("Remove Last                    :- ");
        list.printList();

        list.addinMiddle(1, "new");
        System.out.print("Added in middle                :- ");
        list.printList();

        // Reverse Method
        B_LinkedList_02.node head = LL.new node("1");
        head.next = LL.new node("2");
        head.next.prev = head;
        head.next.next = LL.new node("3");
        head.next.next.prev = head.next;
        head.next.next.next = LL.new node("4");
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = LL.new node("5");
        head.next.next.next.next.next = head.next.next.next;

        System.out.print("Original Linked List           :- ");
        list.printList();

        // Reverse the linked list
        B_LinkedList_02.node reversedHead = LL.reverseList(head);

        System.out.print("Reversed Linked List           :- ");
        while (reversedHead != null) {
            System.out.print(reversedHead.data + " -> ");
            reversedHead = reversedHead.next;
        }
        System.out.println("null");
    }
}
