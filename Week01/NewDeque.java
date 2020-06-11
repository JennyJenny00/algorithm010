import java.util.*;
/*
Replace push() with addFirst() 
Replace peek() with peekFirst() 
Replace pop() with pollFirst() 
*/
public class NewDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);

        String str = deque.peekFirst();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.pollFirst());
        }
        System.out.println(deque);
    }
}
