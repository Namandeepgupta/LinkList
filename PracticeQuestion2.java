public class PracticeQuestion2 {
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
        } 
        else {
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

    public void deleteNAfterM(int M, int N) {
        Node current = head;
        for(int i=1; i<M && current != null; i++){
            current = current.next; 
        }
        if(current == null){
            return;
        }
        Node temp = current.next;
        for(int i=1; i<=N && temp != null; i++){
            temp = temp.next;
        }
        current.next = temp; 
        current = temp;
    }

    public static void main(String[] args) {
        PracticeQuestion2 ll = new PracticeQuestion2();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);

        System.out.println("Original List:");
        ll.printList();

        ll.deleteNAfterM(2, 2);
        System.out.println("Modified List after deleting 2 nodes after 2 nodes:");
        ll.printList();

        PracticeQuestion2 ll2 = new PracticeQuestion2();
        ll2.addLast(1);
        ll2.addLast(2);
        ll2.addLast(3);
        ll2.addLast(4);
        ll2.addLast(5);
        ll2.addLast(6);
        ll2.addLast(7);
        ll2.addLast(8);
        ll2.addLast(9);
        ll2.addLast(10);

        System.out.println("\nOriginal List for second example:");
        ll2.printList();

        ll2.deleteNAfterM(3, 2);
        System.out.println("Modified List after deleting 2 nodes after 3 nodes:");
        ll2.printList();
    }
}

