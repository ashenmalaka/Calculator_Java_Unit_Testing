package Version06.Operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MulOperationTest {

    @Test
    public void multiPositiveToPositiveTest() {
        Operation operation = new MulOperation(2, 3);
        double result = operation.perform();
        assertThat(result, is(6.0));
    }

    @Test
    public void mulPositiveToZeroTest() {
        Operation operation = new MulOperation(2, 0);
        double result = operation.perform();
        assertThat(result, is(0.0));
    }

    @Test
    public void mulNegativeToZeroTest() {
        Operation operation = new MulOperation(-2, 0);
        double result = operation.perform();
        assertThat(result, is(0.0)) ;
    }

    @Test
    public void mulNegativeToNegativeTest() {
        Operation operation = new MulOperation(-2, -3);
        double result = operation.perform();
        assertThat(result, is(6.0));
    }

    @Test
    public void mulZeroToZeroTest() {
        Operation operation = new MulOperation(0, 0);
        double result = operation.perform();
        assertThat(result, is(0.0));
    }

    @Test
    public void mulPositiveToNegativeTest() {
        Operation operation = new MulOperation(2, -3);
        double result = operation.perform();
        assertThat(result, is(-6.0));
    }
}