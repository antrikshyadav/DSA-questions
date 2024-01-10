//  write a program to add eliment at first position in linked list
class addfirst {

  Node head;

  //    class Node is template to create a new Node
  class Node {

    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  //  function to add eliment at first in list
  public void addfirst(String data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      return;
    }
    newnode.next = head;
    head = newnode;
  }

  //   function to print a list

  public void print() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + "->");
      current = current.next;
    }
  }

  //  main function

  public static void main(String[] args) {
    addfirst list = new addfirst();
    list.addfirst("i");
    list.addfirst("am");
    list.addfirst("antriksh");
    list.addfirst("yadav");
    list.print();
  }
}
