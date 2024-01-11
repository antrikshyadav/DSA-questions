public class addlast {

  Node head;

  // Node class is a template for creating new node
  class Node {

    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  //  function to add eliment at last position in list
  public void addlast(String data) {
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
      System.out.print(current.data + "->");
      current = current.next;
    }
  }

  public static void main(String args[]) {
    addlast list = new addlast();
    // System.out.println("hyy");
    list.addlast("antriksh ");
    list.addlast("is ");
    list.addlast("a");
    list.addlast("good");
    list.print();
  }
}
