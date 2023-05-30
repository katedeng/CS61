public class Sort{
    /** sort a String destructively */
    public static void sort(String[] x){
        // find the smallest string
        // move it to the front
        // recursive the remaining string
        //int smallestIndex = findSmallest(x);
        //swap(x,0,smallestIndex);
    }
    /** swap the items */
    public static void swap(String[] x,int a,int b){
        String temp=x[a];
        x[a]=x[b];
        x[b]=x[a];
    }
    /** return the index of the smallest */
    public static int findSmallest(String[] x, int start){
        int smallestIndex=start;
        for (int i = start; i< x.length; i++){
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp<0){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

}
