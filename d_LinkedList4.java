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
        System.out.println("null");
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
    public static void deleteIndex(int index)
    {
        if(head==null){
            System.out.println("No Data");
             return;
        }
        if(index==0)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;temp!=null &&i<index-1;i++){
            temp=temp.next;
        }
        if(temp==null || temp==temp.next)
        {
            System.out.println("Out of Range");
            return;
        }
        temp.next = temp.next.next;
    }
    public static void deletebyValue(int value)
    {
        if(head==null){
            System.out.println("No Data");
             return;
        }
        if(head.data==value)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        //Some data is there it is not end
        while(temp.next!=null && temp.next.data!=value)
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            System.out.println("Not Found");
            return;
        }
        temp.next = temp.next.next;
    }

}
public class d_LinkedList4 {
    public static void main(String[] args) {
        ListOfFunctions lf=new ListOfFunctions();
        lf.addfirst(10);
        lf.addfirst(20);
        lf.addfirst(30);
        lf.addfirst(40);
        lf.display();
        lf.deleteIndex(3);
        lf.display();
        lf.deletebyValue(20);
        lf.display();
    }
}

