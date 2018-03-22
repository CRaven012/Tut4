import junit.framework.*;

public class Test extends TestCase {
    protected int value1, value2;

    Main m = new Main();

    // test method to add two values
    public void testAdd(){
        double result = value1 + value2;
        assertEquals(m.Multiply(3,4),48);
    }
}
