import org.junit.Test;
import org.junit.runner.RunWith;
import junit.framework.*;

import com.google.code.tempusfugit.concurrency.IntermittentTestRunner;
import com.google.code.tempusfugit.concurrency.annotations.Intermittent;

@RunWith(IntermittentTestRunner.class)
public class Flaky extends TestCase{

    @Test
    @Intermittent(repetition = 10)
    public void test() {
        assertEquals("1","1");
    }
}