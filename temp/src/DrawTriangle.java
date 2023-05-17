/** Class that prints a triangle from a given number.
 *  @author katedeng
 */
public class DrawTriangle{
    /** built a function to draw a triangle */
    public static void drawTriangle(int n){
        String x = "*"
        while (n > 0){
            System.out.println(x);
            n = n - 1;
            x = x + "*";
        }

    }
    public static void main(String[] args){
        drawTriangle(5);
    }
}
