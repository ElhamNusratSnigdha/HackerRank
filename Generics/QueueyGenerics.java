package Generics;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueyGenerics<D>{
    LinkedList<D> queue;

    //making a queue instance
    public QueueyGenerics(){
        queue=new LinkedList();
    }

    //Is out queue empty?
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    //what is the size of the queue
    public int size(){
        return queue.size();
    }

    //enqueuing an item
    public void enqueue(D n){
        queue.addLast(n);
    }

    //dequeuing an item
    public D dequeue(){
        return  queue.remove(0);
    }

    //peek at the first item
    public D peek(){
        return queue.get(0);
    }

    public static void main(String[] args) {

        QueueyGenerics numberQueue = new QueueyGenerics();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: "+numberQueue.dequeue());
        System.out.println("Peek at the second item: "+numberQueue.peek());
        System.out.println("Second out: "+numberQueue.dequeue());
        System.out.println("Third out: "+numberQueue.dequeue());

        QueueyGenerics stringQueue = new QueueyGenerics();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");
        System.out.print(stringQueue.dequeue()+" ");
        System.out.print(stringQueue.dequeue()+".");
    }
}
