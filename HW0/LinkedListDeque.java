package deque;

public class LinkedListDeque<T> {
    private Node sentinel;
    private int size;

    public class Node{
        public Node prev;
        public T item;
        public Node next;
        public Node(T i){
            this.item = i;
            this.prev = null;
            this.next = null;
        }
    }

    /** creates an empty Linked list deque.*/
    public LinkedListDeque(){
        sentinel = new Node(1000);
        sentinel.prev = null;
        sentinel.next = sentinel;
        size = 0;
    }

    public LinkedListDeque(T item){
        sentinel = new Node(1000);
        sentinel.prev = null;
        sentinel.next = new Node(item);
        size = 1;
    }
    /** adds an item of type T to the front of the deque */
    public void addFirst(T item){
        Node newNode = new Node(item);
        Node firstNode = sentinel.next;

        newNode.prev = sentinel;
        newNode.next = firstNode;
        firstNode.prev = newNode;
        sentinel.next = newNode;
    }

    /** prints the items in the deque from first to last , separated by a space.*/
    public void printDeque(){
        Node currentNode = sentinel.next;
        while(currentNode != sentinel){
            System.out.print(currentNode.item + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }


    public static void main(String[] args){
        LinkedListDeque<Integer> LLDeque = new LinkedListDeque(10);
        LLDeque.addFirst(5);
        LLDeque.addFirst(15);
        LLDeque.printDeque();
    }
}
