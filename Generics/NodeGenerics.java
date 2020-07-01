package Generics;

public class NodeGenerics<D> {
    //Properties
    NodeGenerics<D> next;
    D data;

    //Methods


    //Constructors
    public NodeGenerics(D newData){
        data = newData;
        next = null;
    }
    public NodeGenerics(D newData, NodeGenerics newNext){
        data=newData;
        next=newNext;
    }

    //Getters & setters
    public D getData(){
        return data;
    }
    public NodeGenerics<D> getNext(){
        return next;
    }
    public void setData(D newData){
        data=newData;
    }
    public void setNext(NodeGenerics<D> newNode){
        next=newNode;
    }
}
