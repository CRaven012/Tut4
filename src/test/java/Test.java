import junit.framework.*;

public class Test extends TestCase {
    SampleMain test = new SampleMain();

    public void testMul(){
        assertEquals(test.Multiply(3,4),48);
    }

    public void testDiv() {
        assertEquals(test.Divide(6,2),3);
    }

    public void testDiv0() {
        assertEquals("Cannot divide by 0",test.Divide(3,0),-1);
    }

    public void testA() {
        assertEquals(test.Divide(4,2),2);
    }
}
