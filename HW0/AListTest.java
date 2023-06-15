import org.junit.Test;
import static org.junit.Assert.*;
/** Test the AList class. */
public class AListTest {
    @Test
    public void testEmptySize(){
        AList L = new AList();
        assertEquals(0,L.size());
    }

}
