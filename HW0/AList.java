
public class AList<Item>{
    Item[] items;
    int size;
    /** creates an empty list.*/
    public AList(){
        items = (Item[])new Object[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity.*/
    public void resize(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }

    /** insert x into the back of the list*/
    public void addLast(Item x){
        if (size == items.length){
            resize(size+1);
        }
        items[size] = x;
        size = size + 1;
    }

    /** returns the item from the back of the list */
    public Item getLast(){
        return items[size-1];
    }

    /** gets the ith item in the list (0 is the front) */
    public Item get(int i){
        return items[i];
    }

    /** returns the number of items in the list */
    public int size(){
        return size;
    }

    /** deletes item from back of the list and returns deleted item*/
    public Item removeLast(){
        Item returnItem = getLast();
        size = size - 1;
        items[size-1] = null;
        return returnItem;
    }




}
