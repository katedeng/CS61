
public class TestSort {
    /** test the sort */
    public static void testSort(){
        String[] input = {"i","have","an","egg"};
        String[] expected= {"an","egg","have","i"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected,input);
    }
    /** test the Sort.findSmallest */
    public static void testFindSmallest(){
        String[] input= {"i","have","an","egg"};
        int expected=2;
        int actual=Sort.findSmallest(input,0);
        org.junit.Assert.assertEquals(expected,actual);

    }
    /** test the swap method */
    public static void testSwap(){
        String[] input = {"i","have","an","egg"};
        int a = 0;
        int b = 2;
        String[] expected= {"an","have","i","egg"};
        Sort.swap(input,a,b);
        org.junit.Assert.assertArrayEquals(expected, input);
    }
    public static void main(String[] args){
        testSort();
        testFindSmallest();
        testSwap();
    }
}
