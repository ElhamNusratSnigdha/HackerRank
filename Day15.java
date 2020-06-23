import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Day15 {
    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head==null){
            Node newHead = new Node(data);
            head=newHead;
            return head;
        }else{
            Node current = head;
            Node newNode = new Node(data);
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
            return head;
        }
    }


    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();

    }
}
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
/* Extra Materials:
     #Linked List: A singly linked list is a data structure having a list of elements where each element has a reference
                   pointing to the next element in the list.
                   Its elements are generally referred to as nodes; each node has a data field containing a data value and
                   a next field pointing to the next element in the list (or null if it is the last element in the list).

                   The sample code below demonstrates how to create a LinkedList of Strings, and some of the operations
                   that can be performed on it.
                    LinkedList<String> myLinkedList = new LinkedList<String>();
                    // Add a node with data="First" to back of the (empty) list
                    myLinkedList.add("First");

                    // Add a node with data="Second" to the back of the list
                    myLinkedList.add("Second");

                    // Insert a node with data="Third" at front of the list
                    myLinkedList.addFirst("Third");

                    // Insert a node with data="Fourth" at back of the list
                    myLinkedList.addLast("Fourth");

                    // Insert a node with data="Fifth" at index 2
                    myLinkedList.add(2, "Fifth");

                    // Print the list: [Third, First, Fifth, Second, Fourth]
                    System.out.println(myLinkedList);

                    // Print the value at list index 2:
                    System.out.println(myLinkedList.get(2));

                    // Empty the list
                    myLinkedList.clear();

                    // Print the newly emptied list: []
                    System.out.println(myLinkedList);

                    // Adds a node with data="Sixth" to back of the (empty) list
                    myLinkedList.add("Sixth");
                    System.out.println(myLinkedList); // print the list: [Sixth]

                   The above code produces the following output:
                   [Third, First, Fifth, Second, Fourth]
                   Fifth
                   []
                   [Sixth]
 */
