package SinglyLinkedList;

public class SinglyLinkedList {

    private Node head=null;
    private int size=0;

    private class Node{
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
}
