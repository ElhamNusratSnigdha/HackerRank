package linkedlist;

public class LinkedList {
    //properties
    Node head;
    int count;

    //constructors
    public LinkedList(){
        head=null;
        count=0;
    }
    public LinkedList(Node newHead){
        head=newHead;
        count=1;
    }

    //methods
    //add
    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext()!=null){
            current=current.getNext(); 
        }
    }
    //get
    //size
    //isEmpty
    //remove

    public static void main(String[] args) {

    }
}
