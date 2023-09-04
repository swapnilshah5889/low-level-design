package Polymorphism.IterableTree;

import java.util.Iterator;

public class Node implements Iterable<Node> {

    int data;
    Node next;

    Node(int data) {
        this(data, null);
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }

    public static class NodeIterator implements Iterator<Node> {
        private Node head;

        NodeIterator(Node head) {
            this.head = head;
        }

        @Override
        public boolean hasNext() {
            return head!=null;
        }

        @Override
        public Node next() {
            Node temp = head;
            head = head.next;
            return temp;
        }
    }
}
