
public class AList {
    int[] items;
    int size;
    /** creates an empty list.*/
    public AList(){
        items = new int[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity.*/
    public void resize(int capacity){
        int[] a = new int[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }

    /** insert x into the back of the list*/
    public void addLast(int x){
        if (size == items.length){
            resize(size+1);
        }
        items[size] = x;
        size = size + 1;
    }

    /** returns the item from the back of the list */
    public int getLast(){
        return items[size-1];
    }

    /** gets the ith item in the list (0 is the front) */
    public int get(int i){
        return items[i];
    }

    /** returns the number of items in the list */
    public int size(){
        return size;
    }

    /** deletes item from back of the list and returns deleted item*/
    public int removeLast(){
        int returnItem = getLast();
        size = size - 1;
        items[size-1] = 0;
        return returnItem;
    }




}
