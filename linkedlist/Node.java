package linkedlist;

public class Node {
    //Properties
    Node next;
    int data;

    //Methods


    //Constructors
    public Node(int newData){
        data = newData;
        next = null;
    }
    public Node(int newData, Node newNext){
        data=newData;
        next=newNext;
    }

    //Getters & setters
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(int newData){
        data=newData;
    }
    public void setNext(Node newNode){
        next=newNode;
    }
}
