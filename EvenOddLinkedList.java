public class EvenOddLinkedList {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;  
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void evenOddList() {
        if(head == null || head.next == null){
            return;
        }
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node current = head;
        while (current != null) {
            if(current.data % 2 == 0){
                if(evenHead == null){
                    evenHead = current;
                    evenTail = evenHead;
                }
                else{
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            }
            else{
                if(oddHead == null){
                    oddHead = current;
                    oddTail = oddHead;
                }
                else{
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }
        if(evenHead == null){
            return;
        }
        evenTail.next = oddHead;
        if(oddTail != null){
            oddTail.next = null;
        }
        head = evenHead;
    }

    public static void main(String[] args) {
        EvenOddLinkedList ll = new EvenOddLinkedList();
        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);

        System.out.println("Original List:");
        ll.printList();

        ll.evenOddList();

        System.out.println("Modified List (Even before Odd):");
        ll.printList();

        EvenOddLinkedList ll2 = new EvenOddLinkedList();
        ll2.addLast(1);
        ll2.addLast(3);
        ll2.addLast(5);
        ll2.addLast(7);

        System.out.println("Original List:");
        ll2.printList();
        ll2.evenOddList();

        System.out.println("Modified List (Even before Odd):");
        ll2.printList();
    }
}
