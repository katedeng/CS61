public class TestSort {
    /** test the Sort.sort */
    public static void testSort(){
        String[] input = {"i","have","an","egg"};
        String[] expected= {"an","egg","have","i"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected,input);
    }
    /** test the Sort.findSmallest */
    public static void testfindSmallest(){
        String[] input= {"i","have","an","egg"};
        int start=0;
        int expected=2;
        int actual=Sort.findSmallest(input,start);
        org.junit.Assert.assertEquals(expected,actual);

    }
    /** test the Sort.swap method */
    public static void testSwap(){
        String[] input = {"i","have","an","egg"};
        int a = 0;
        int b = 2;
        String[] expected= {"an","have","i","egg"};
        Sort.swap(input,a,b);
        org.junit.Assert.assertArrayEquals(expected , input);
    }
    public static void main(String[] args){
        //testSort();
        testfindSmallest();
        testSwap();

    }

}
