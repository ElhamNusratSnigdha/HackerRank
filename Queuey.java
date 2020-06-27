package Queuey;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey {
    LinkedList queue = new LinkedList();

    //making a queue instance
    public Queuey(){
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
    public void enqueue(String n){
        queue.addLast(n);
    }

    //dequeuing an item
    public String dequeue(){
        return  (String)queue.remove(0);
    }

    //peek at the first item
    public String peek(){
        return (String) queue.get(0);
    }
    public static void main(String[] args) {
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.print(stacky.pop()+" ");
        System.out.println("Peek: "+stacky.peek());
        System.out.print(stacky.pop()+"!");
        System.out.println("Size: "+stacky.size());
        /*
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: "+numberQueue.dequeue());
        System.out.println("Peek at the second item: "+numberQueue.peek());
        System.out.println("Second out: "+numberQueue.dequeue());
        System.out.println("Third out: "+numberQueue.dequeue());

         */
        /*
        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");
        System.out.print(stringQueue.dequeue()+" ");
        System.out.print(stringQueue.dequeue()+" .");

         */
    }
}
