import java.util.LinkedList;

public class CollectionFramework {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(0);
        ll.addLast(1);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
