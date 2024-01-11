//  reverse a linked list
public class Reverse {

  Node head;

  class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addlast(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      return;
    }

    Node currentNode = head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newnode;
  }

  public void print() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + "<-");
      current = current.next;
    }
    System.out.println("NULL");
  }

  public void reverse() {
    Node prev = head;
    Node curr = head.next;

    while (curr != null) {
      Node nxt = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nxt;
    }
    head.next = null;
    head = prev;
  }

  public static void main(String[] args) {
    Reverse list = new Reverse();
    list.addlast(1);
    list.addlast(2);
    list.addlast(3);
    list.addlast(4);
    list.reverse();
    list.print();
  }
}
