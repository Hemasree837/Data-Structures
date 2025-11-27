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
    public static boolean searching(int key)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
    }
    public static void indexInsert(int data,int index)
    {
        Node newnode=new Node(data);
        if(index==0){
            addfirst(data);
            return;
        }
        Node temp=head;
        for(int i=0;temp!=null && i<index-1;i++)
        {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("Out of bounds");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

}
public class d_LinkedList3 {
    public static void main(String[] args) {
        ListOfFunctions lf=new ListOfFunctions();
        lf.addfirst(10);
        lf.addfirst(20);
        lf.addfirst(30);
        lf.addfirst(40);
        lf.display();
        System.out.println(lf.searching(30));
        lf.indexInsert(66,2);
        lf.display();
    }
}
