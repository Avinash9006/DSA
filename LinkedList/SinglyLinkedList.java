class Utility {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.add("4");
        ll.add("3");
        ll.add("2");
        ll.add("1");
        ll.traverse();
    }
}

class SinglyLinkedList {
    Node head = null;

    public void add(String i) {
        if (head == null) {
            head = new Node(i);
        } else {
            Node temp = head;
            head = new Node(i);
            head.next = temp;
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            if (temp.next != null)
                System.out.print(temp.value + " -> ");
            else
                System.out.print(temp.value);
            temp = temp.next;
        }
    }

}

class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }

}