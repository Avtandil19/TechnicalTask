import java.util.HashMap;
import java.util.Map;

/*
 * 6. დაწერეთ საკუთარი მონაცემთა სტრუქტურა, რომელიც საშუალებას მოგვცემს O(1) დროში
 * წავშალოთ ელემენტი.
 */
public class MyDataStructure<T> {
    private class Node {
        private T elem;
        private Node next;
        private Node prev;
    }

    private final Map<T, Node> map;
    private Node head;
    private Node tail;

    public MyDataStructure() {
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.prev = null;
        head.next = tail;
        tail.prev = head;
        tail.next = null;
    }

    public void add(T elem) {
        if (map.containsKey(elem)) {
            return;
        }

        Node node = new Node();

        node.elem = elem;
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;

        map.put(elem, node);
    }

    /*
     * HashMap - ის remove და containsKey მეთოდებს time comlexity აქვთ O(1). მთლიანობაში ჩემს მიერ შექმნილი remove
     * მეთოდის time complexity იქნება O(1)
     */
    public void remove(T elem) {
        if (map.containsKey(elem)) {
            Node node = map.get(elem);

            node.prev.next = node.next;
            node.next.prev = node.prev;

            map.remove(elem);
        }
    }

    public void printElems() {
        Node tmp = head.next;
        while (true) {
            if (tmp == tail) break;
            System.out.println(tmp.elem);
            tmp = tmp.next;
        }
    }
}
