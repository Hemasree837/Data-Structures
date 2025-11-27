class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
class ListOfFunctions{
    static Node head;
    public static void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void addfirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void insert(int data)
    {
        Node newNode=new Node(data);
        if(head!=null)
        {
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public static void reverseList()
    {
        Node prev=null;
        Node current=head;
        Node next;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

}
public class d_LinkedList2 {
    public static void main(String[] args) {
        ListOfFunctions lf=new ListOfFunctions();
        lf.addfirst(10);
        lf.addfirst(20);
        lf.addfirst(30);
        lf.addfirst(40);
        lf.display();
        lf.reverseList();
        System.out.println("Reverselist");
        lf.display();
    }
}
