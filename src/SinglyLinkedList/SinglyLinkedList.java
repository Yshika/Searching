package SinglyLinkedList;

public class SinglyLinkedList {

    private Node head=null;
    private int size=0;

    //method to insert a new node at head
    public void insert(int value){
        head=new Node(value,head);
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
    }
}
