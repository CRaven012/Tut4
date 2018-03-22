import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.code.tempusfugit.concurrency.IntermittentTestRunner;
import com.google.code.tempusfugit.concurrency.annotations.Intermittent;

@RunWith(IntermittentTestRunner.class)
public class Flaky {
    @Test
    @Intermittent(repetition = 10)
    public void test() {
        System.out.println("test");
    }
}