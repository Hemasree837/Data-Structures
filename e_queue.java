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
    private Node front=null;
    private Node rear=null;
    //Function to Add
    public void enQueue(int data){
        Node newnode=new Node(data);
        if(rear==null){
            rear=front=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }
    public void deQueue()
    {
        if(front==null)
        {
            System.out.println("No data");
            return;
        }
        front=front.next;
        if(front==null) rear=null;
    }
    public void display(){
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void frontValue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        else System.out.println("Element is "+front.data);
    }
}
public class e_queue {
    public static void main(String[] args) {
        functionss fs=new functionss();
        fs.enQueue(20);
        fs.enQueue(30);
        fs.enQueue(90);
        fs.enQueue(10);
        fs.display();
        fs.deQueue();
        fs.display();
        fs.frontValue();
    }
}
