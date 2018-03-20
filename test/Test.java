import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

    String message = "Hello World";
    Main m = new Main();

    @Test
    public void testPrintMessage() {
        assertEquals(m.Multiply(3,4),48);
    }

    @Test
    public void testA() {
        assertTrue(1 == 1);
    }






}