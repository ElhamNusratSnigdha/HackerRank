package Generics;
import java.util.LinkedList;
public class LinkedListGenerics<D> {
    //properties
    NodeGenerics<D> head;
    int count;

    //constructors
//    public LinkedList(){
//        head=null;
//        count=0;
//    }
    public LinkedListGenerics(NodeGenerics<D> newHead){
        head=newHead;
        count=1;
    }

    //methods
    //add
    public void add(D newData){
        NodeGenerics<D> temp = new NodeGenerics(newData);
        NodeGenerics<D> current = head;
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    //get
    public D get(int index){
//        if(index<=0){
//            return -1;
//        }
        NodeGenerics<D> current = head;
        for (int i=1;i<index;i++){
            current=current.getNext();
        }
        return current.getData();
    }
    //size
    public int size(){
        return count;
    }
    //isEmpty
    public boolean isEmpty(){
        return head==null;
    }
    //remove
    public void remove(){
        //remove from the back of the list
        NodeGenerics<D> current = head;
        while (current.getNext().getNext()!=null){
            current=current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.add("Alice");
        linkedList1.add("Alicy");
        System.out.println(linkedList1);

        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList2.add(1);
        linkedList2.add(5);
        linkedList2.add(8);
        linkedList2.add(9);
        System.out.println(linkedList2);
    }
}
