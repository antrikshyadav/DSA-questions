// Search and Remove N-th Node from End
public class Nth_Node {

  Node head;

  class Node {

    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addfirst(String data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      return;
    }
    newnode.next = head;
    head = newnode;
  }

  public void print() {
    Node currNode;
    currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + "->");
      currNode = currNode.next;
    }
  }

  public int size() {
    int size = 0;
    Node currNode;
    currNode = head;
    while (currNode != null) {
      currNode = currNode.next;
      size++;
    }
    return size;
  }

  public void delete(int d) {
    Node currNode = head;
    Node prev = currNode;
    for (int j = 1; j <= d - 1; j++) {
      prev = currNode;
      currNode = currNode.next;
    }
    prev.next = currNode.next;
  }

  public void searchnth(int n) {
    Node del = head.next;
    int s = size() - n + 1;
    int d = s - 1;
    delete(d);
    print();
  }

  public static void main(String[] args) {
    Nth_Node list = new Nth_Node();
    list.addfirst("i");
    list.addfirst("am");
    list.addfirst("antriksh");
    list.addfirst("yadav");
    list.searchnth(2);
  }
}
