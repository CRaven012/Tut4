import junit.framework.*;

public class Test extends TestCase {
    protected int value1, value2;

    Main m = new Main();

    // test method to add two values

    public void testMul(){
        double result = value1 + value2;
        assertEquals(m.Multiply(3,4),48);
    }

    public void testDiv() {
        assertEquals(m.Divide(6,2),3);
    }

    public void testDiv0() {
        assertEquals("Cannot divide by 0",m.Divide(3,0),-1);
    }
}
