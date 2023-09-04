package Polymorphism.IterableTree;

public class Client {
    public static void main(String[] args) {
        Node n = new Node(10);
        n.next = new Node(5);
        n.next.next = new Node(12);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(9);
        n.next.next.next.next.next = new Node(40);

        for(Node i : n) {
            System.out.println(i.data);
        }
    }
}
