import org.w3c.dom.Node;

public class sample {

  public void reverse() {
    Node prev = head;
    Node currNode = head.next;
    Node nextn = currNode.next;

    while (currNode != null) {
      currNode.next = prev;
      prev = currNode;
      currNode = nextn;
    }
    head.next = null;
    head = prev;
  }
}
