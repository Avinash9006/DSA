class ReverseLinkedList {

    Node head;
    Node tail;

    public ReverseLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void add(int i) {
        Node t = new Node(i);
        if (head == null) {

        }
    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
    }

}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

}
