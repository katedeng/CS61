package deque;

import java.util.Iterator;

public class LinkedListDeque<T> {
    private Node<T> sentinel;
    private int size;

    public class Node<T>{
        public Node<T> prev;
        public T item;
        public Node<T> next;
        public Node(T i){
            this.item = i;
            this.prev = null;
            this.next = null;
        }
    }

    /** creates an empty Linked list deque. circular sentinel*/
    public LinkedListDeque(){
        sentinel = new Node<>(null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public LinkedListDeque(T item){
        sentinel = new Node<>(null);
        sentinel.prev = sentinel;
        sentinel.next = new Node(item);
        size = 1;
    }
    /** adds an item of type T to the front of the deque */
    public void addFirst(T item){
        if(item != null) {
            Node<T> newNode = new Node<>(item);
            Node<T> firstNode = sentinel.next;

            newNode.prev = sentinel;
            newNode.next = firstNode;
            firstNode.prev = newNode;
            sentinel.next = newNode;
            size =size +1;
        }
    }

    /** adds an item of type T to the back of the deque. */
    public void addLast(T item){
        size = size + 1;
        if(item != null){
            Node<T> newNode = new Node<>(item);
            Node<T> p = sentinel;
            // traverse p until it reaches the end of the deque.
            while (p.next != null){
                p = p.next;
            }
            p.next = newNode;
            newNode.next = null;
            newNode.prev = p;

        }
    }

    /** returns true if deque is empty , false otherwise .*/
    public boolean isEmpty(){
        return sentinel.next == sentinel;
    }

    /** returns the number of items in the deque. */
    // returns the size from starting node p by using recursion.
    private  int size(Node<T> p){
        if (p.next==sentinel){return 1;}
        return 1+size(p.next);
    }
    public int size(){
        return size;
    }

    /** removes and returns the item at the front of the deque. if no such item exists, returns null.*/
    public T removeFirst(){
        size = size -1;
        if(sentinel.next != sentinel) {
            Node<T> firstNode = sentinel.next;
            T data = firstNode.item;

            if (firstNode.next != sentinel) {
                sentinel.next = firstNode.next;
                firstNode.next.prev = sentinel;
            }else{
                sentinel.next = sentinel;
            }
            return data;
        }
        return null;
    }

    /** removes and returns the item at the back of the deque. if no such item exists , returns null. */
    public T removeLast(){
        size = size -1;

        Node<T> p = sentinel;
        if (p.next == sentinel){
            return null;
        }else {
            while (p.next != null) {
                p = p.next;
            }
            T data = p.item;
            p.prev.next = sentinel;
            return data;
        }
    }

    /** gets the item at the given index , where 0 is the front, 1 is the next item, and so forth.
     if no such item exists , returns null. must not alter the deque. */
    public T get(int index){
        int currentIndex=0;
        Node<T> currentNode = sentinel.next;
        // traver the list until it reaches at index
        while (currentNode != sentinel && currentIndex <index){
            currentIndex += 1;
            currentNode = currentNode.next;
        }
        // if node at index exists,returns item, returns null otherwise.
        if(currentNode != sentinel){
            return currentNode.item;
        }
        return null;
    }
    /** using recursion to get item at index*/
    // helper method
    private T getRecursive(Node<T> currNode, int currIndex, int targetIndex){
        if (currNode != sentinel && currIndex < targetIndex){
            currNode = currNode.next;
            return getRecursive(currNode , currIndex+1,targetIndex);
        }
        if (currNode != sentinel){
            return currNode.item;
        }
        return null;
    }
    public T getRecursive(int index){
        return getRecursive(sentinel.next,0,index);
    }

    /** the deque objects we'll make are iterable. return an iterator. */
    //public Iterator<T> iterator(){}




    /** prints the items in the deque from first to last , separated by a space.*/
    public void printDeque(){
        Node<T> currentNode = sentinel.next;
        while(currentNode != null){
            System.out.print(currentNode.item + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }


    public static void main(String[] args){
        LinkedListDeque<Integer> LLDeque = new LinkedListDeque<Integer>(10);
        LLDeque.addFirst(5);
        LLDeque.addFirst(1);
        LLDeque.addLast(15);
        LLDeque.printDeque();
        System.out.println(LLDeque.isEmpty());
        System.out.println(LLDeque.size());
        System.out.println(LLDeque.removeFirst());
        LLDeque.printDeque();
        System.out.println(LLDeque.size());
        System.out.println(LLDeque.removeLast());
        LLDeque.addLast(20);
        LLDeque.addFirst(8);
        LLDeque.printDeque();
        System.out.println(LLDeque.get(2));
        System.out.println(LLDeque.getRecursive(2) );


    }
}


