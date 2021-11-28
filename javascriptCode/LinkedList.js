class Node {
  constructor(element) {
    this.element = element;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
  }

  add(element) {
    var node = new Node(element);
    if (this.head == null) {
      this.head = this.tail = node;
    } else {
      this.tail.next = node;
      this.tail = node;
    }
  }

  remove(value) {
    if(this.head == null) return;
    var temp = this.head;
    var prev = null
    while(temp!=null && temp.data == value) {
      prev = temp;
      temp = temp.next;
    }
    if(temp != null){
      prev.next = temp
    }
  }

  display() {
    if (this.head == null) return;
    var temp = this.head;
    while (temp != null) {
      process.stdout.write(temp.element + " -> ");
      temp = temp.next;
    }
    process.stdout.write("END");
    console.log();
  }



  reverse() {
    if (this.head == null || this.head == this.tail) return;
    let curr = this.head;
    this.tail = this.head;
    let prev = null;
    let future = this.head;

    while (curr != null) {
      future = future.next;
      curr.next = prev;
      prev = curr;
      curr = future;
    }
    this.head = prev;
  }
}

var ll = new LinkedList();
for (let i = 1; i <= 10; i++) {
  ll.add(i);
}
ll.display();
ll.reverse();
ll.display();
ll.reverse();
ll.display();
