class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
class functionss{
static Node top=null;
public static void push(int data)
{
    Node newNode=new Node(data);
    newNode.next=top;
    top=newNode;
}
public static void pop(){
    if(top==null)
    {
        System.out.println("No Data");
        return;
    }
    System.out.println(top.data);
    top=top.next;
}
public static void peek()
{
    if(top==null)
    {
        System.out.println("No PeakValue");
        return;
    }else{
        System.out.println(top.data);
    }
}
public static void display()
{
    Node temp=top;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
}
public class d_StackLL {
    public static void main(String[] args) {
        functionss fs=new functionss();
        fs.push(30);
        fs.push(10);
        fs.push(20);
        fs.display();
        fs.pop();
        fs.display();
        fs.peek();
        fs.display();
    }
}
