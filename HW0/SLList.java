public class SLListSentinel{
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    /** the first item (if it exists) is at sentinel.next.*/
    private IntNode sentinel;
    private int size;
    // create an empty SSList.
    public SLList(){
         sentinel = new IntNode(100,null);
         size = 0;
    }

    public SLList(int x){
        sentinel = new IntNode(100,null);
        sentinel.next= new IntNode(x,null);
        size = 1;
    }

    /** adds an item to the front of the list.*/
    public void addFirst(int x){
        sentinel.next= new IntNode(x,sentinel.next);
        size += 1;
    }

    /** retrieves the front item from the list.*/
    public int getFirst(){
        return sentinel.next.item;
    }
    /** add a last item to the list */
    public void addLast(int x){
        size = size + 1;
        IntNode p = sentinel;
        // move p until it reaches the end of the list.
        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
    }

    /** returns the size of the list at node p*/
    private static int size(IntNode p){
        if (p.next == null){
            return 1;
        }
        return 1+size(p.next);
    }
    public int size(){
        return size;

    }

    public static void main(String[] args){
        // create a list of one integer, namely 10.
        SLList L = new SLList(10);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());
    }
}

