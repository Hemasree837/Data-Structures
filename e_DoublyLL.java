class Node{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
        this.prev=null;
        this.data=data;
        this.next=null;
    }
}
class doublyLLmethods{
    private Node head=null;
    private Node tail=null;
    public void insertAtEnd(int data)
    {
        Node newnode=new Node(data);
        if(tail==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }
    //Add Value at First.
    public void insertAtFirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }
    public void forwardTraverse()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void BackwardTraverse()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    public void DeleteAtLast()
    {
        if(tail==null)
        {
            System.out.print("No Data");
            return;
        }
        tail=tail.prev;
        if(tail!=null) tail.next=null;
        else head=null;
    }
    public void DeleteAtFirst()
    {
        if(head==null) {
            System.out.print("No Data");
            return;
        }
        head=head.next;
        if(head!=null) head.prev=null;
        else tail=null;
    }
}
public class e_DoublyLL {
   public static void main(String[] args) {
       doublyLLmethods dlm=new doublyLLmethods();
       dlm.insertAtEnd(10);
       dlm.insertAtEnd(20);
       dlm.insertAtEnd(30);
       dlm.forwardTraverse();
       dlm.BackwardTraverse();
       dlm.insertAtFirst(66);
       dlm.insertAtFirst(33);
       dlm.insertAtFirst(99);
       dlm.forwardTraverse();
       dlm.BackwardTraverse();
       dlm.DeleteAtLast();
       dlm.forwardTraverse();
       dlm.DeleteAtFirst();
       dlm.forwardTraverse();
   } 
}
