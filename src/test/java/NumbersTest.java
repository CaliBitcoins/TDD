import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class NumbersTest {

    @Test
    public void sumsTest() {
        // Step 0 - Test IDE
        //fail("Not implemented");

        // Step 1 - Setup: Testing that Numbers.sums() works
        int actual = 2;
        Numbers numbers = new Numbers();

        // Setp 2 - Exercises

        // Step 3 - Assert
        assertEquals(numbers.sum(1, 1), actual);

        // Step 4 - Teardown

    }
}
