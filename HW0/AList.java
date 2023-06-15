package PACKAGE_NAME;
public class AList {
    int[] items;
    int size;
    /** creates an empty list.*/
    public AList(){
        items = new int[100];
        size = 0;
    }

    /** insert x into the back of the list*/
    public void addLast(int x){
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



}
