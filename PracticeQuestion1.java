import java.util.LinkedList;

public class PracticeQuestion1 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    } 
    public static Node head;
    public static Node tail;

    public static Node getIntersectionNode(Node head1, Node head2){
        while (head2 != null) {
            Node temp = head1;
            while(temp != null){
                if(temp.data == head2.data){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String args[]){
        PracticeQuestion1 ll = new PracticeQuestion1();
        Node head1 = ll.new Node(1);
        head1.next = ll.new Node(2);
        head1.next.next = ll.new Node(3);
        head1.next.next.next = ll.new Node(4);

        PracticeQuestion1 ll1 = new PracticeQuestion1();
        Node head2 = ll1.new Node(7);
        head2.next = ll1.new Node(6);
        head2.next.next = ll1.new Node(5);
        head2.next.next.next = head1.next.next.next;

        if(getIntersectionNode(head1, head2) == null){
            System.out.println("Intersection Not Found.");
        }
        else{
            System.out.println("Intersection Found at node " + getIntersectionNode(head1, head2).data);
        }
    }
}
