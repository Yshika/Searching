package doubly;

public class DoublyLinkedList {
    private static class Node {
        private int data;
        private Node prev = null, next = null;

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
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

    private int size = 0;
    private Node head = null;
    private Node tail = null;

    @Override
    public String toString() {
        StringBuilder resp = new StringBuilder();
        if(size==0){
            resp.append("[]");
        }else{
        resp.append("[ null<==");
        Node temp = this.head;
        while (temp != null) {
            resp.append(temp.data);
            if (temp.next != null) {
                resp.append("<==>");
            }
            temp = temp.next;
        }
        resp.append("==>null ]");
        }
        return resp.toString();
    }

    private void insertHead(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            node.prev = head.prev;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            insertHead(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            node.prev = temp;
            node.next = temp.next;
            temp.next = node;
            tail = node;
            size++;

        }
    }
    public int delete(){
        int resp=-1;
        if(head!=null){
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            resp=temp.data;
            temp=temp.prev;
            temp.next=null;
        }
        size--;
        return resp;
    }
    private int removeHead(){
        int resp=-1;
        if(head!=null){
            resp=head.data;
            Node temp=head.next;
            temp.prev=null;
            head=temp;
        }
        return resp;
    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        System.out.println(linkedList);
        for (int i = 0; i < 5; i++) {
            linkedList.insert(i + 1);
        }
        System.out.println(linkedList);
        System.out.println("Deleted: "+(linkedList.delete()));
        System.out.println(linkedList);
    }
}
