
class ll3{
    
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    
    public void addfirst(int data)
    {
        Node NewNode=new Node(data);
        if(head == null)
        {
            head = NewNode;
            return;
        }
        NewNode.next=head;
        head=NewNode;
    }
    public void print(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node currNode =head;
        while(currNode!=null)
        {
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
    }
    public void reverse_ll(){
        Node previous=head;
        Node current=head.next;
        Node next=head.next.next;
        
    }
    public static void main(String[] args)
    {
        ll3 list=new ll3();
        list.addfirst(6);
        list.addfirst(5);
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        list.print();

    }
}