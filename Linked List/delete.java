public class delete {

  Node head;

  class Node {

    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addlast(String data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      return;
    }
    Node currnode = head;
    while (currnode.next != null) {
      currnode = currnode.next;
    }
    currnode.next = newnode;
  }

  public void deletefirst() {
    if (head == null) {
      System.out.println("the list is empty");
      return;
    }
    head = head.next;
  }

  public void deletelast() {
    if (head == null) {
      System.out.println("the list is empty");
      return;
    }
    Node currNode = head;
    while (currNode.next.next != null) {
      currNode = currNode.next;
    }
    currNode.next = null;
  }

  public void print_list() {
    Node currnode = head;
    while (currnode != null) {
      System.out.print(currnode.data + "->");
      currnode = currnode.next;
    }
    System.out.print("NULL");
  }

  public static void main(String args[]) {
    delete list = new delete();
    list.addlast("1");
    list.addlast("2");
    list.addlast("3");
    list.addlast("4");
    list.addlast("5");
    list.addlast("6");
    list.addlast("7");
    // list before delete
    list.print_list();
    list.deletelast();
    System.out.println(" ");
    //  list after delete
    list.print_list();
  }
}
