package SinglyLinkedList;

public class SinglyLinkedList {

    private Node head=null;
    private int size=0;

    //method to insert a new node at head
    private void insertHead(int value){
        this.head=new Node(value,this.head);//head pr insert kr rhe h or likh skte h ki=>  Node newnode=new Node(value,this.head);
        size++;
    }
    private void insertAfter(int value,Node node){
        node.next=new Node(value,node.next);
        size++;
    }
    public void insert(int value){
     if(head==null){
         insertHead(value);
     }
     else
     {
         Node temp=this.head;
         while(temp.next!=null){
             temp=temp.next;
         }
         insertAfter(value,temp);
     }
    }
    private int removeHead(){
        int resp=-1;
        Node temp=this.head;
        if(head!=null){
            size--;
            resp=temp.data;
            this.head=this.head.next;
        }
        return resp;
    }
    private int removeAfter(Node node)//jo node pr data match krega uske next wala node delete hoga
    {
        int resp=-1;
        Node temp=node.next;
        if(temp!=null){
            resp=temp.data;
            node.next=temp.next;
            size--;
        }
        return resp;
    }
    public int remove(int data){
        int resp=-1;
        Node temp=this.head;
        if(temp.data==data){
            removeHead();
        }else{
            while (temp!=null){
                if(temp.data==data){
                    resp=removeAfter(temp);
                    break;
                }
                temp=temp.next;
            }
        }
        return resp;
    }
    public boolean search(int data) {
        boolean resp = true;
        if (this.head == null) {
            System.out.println("Linkedlist is empty");
            return false;
        }
        Node temp = this.head;
        while (temp.next != null) {
            if (temp.data == data) {
                resp = true;
                break;
            }
            temp = temp.next;
        }
        return resp;
    }

    public String toString(){
        StringBuilder result=new StringBuilder();
        Node temp=head;
        while(temp!=null){
            result.append(temp.data);
            if(temp.next!=null){
                result.append("-->");
            }
            temp=temp.next;
        }
        return result.toString();
    }

    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList linkedlist=new SinglyLinkedList();
        for (int i = 0; i < 5; i++) {
            linkedlist.insert(i+1);
        }
        System.out.println(linkedlist);
        linkedlist.remove(1);
        System.out.println(linkedlist);
        System.out.println(linkedlist.search(2));
    }
}
