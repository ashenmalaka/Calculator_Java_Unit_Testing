package Version06.Operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DivOperationTest {

    @Test
    public void divPositiveByPositiveTest() {
        Operation operation = new DivOperation(6, 3);
        double result = operation.perform();
        assertThat(result, is(2.0));
    }

    @Test
    public void divPositiveByZeroTest() {
        Operation operation = new DivOperation(6, 0);
        double result = operation.perform();
        assertThat(result, is(0.0));
    }

    @Test
    public void divNegativeByZeroTest() {
        Operation operation = new DivOperation(-6, 0);
        double result = operation.perform();
        assertThat(result, is(0.0));
    }

    @Test
    public void divNegativeByNegativeTest() {
        Operation operation = new DivOperation(-6, -3);
        double result = operation.perform();
        assertThat(result, is(2.0));
    }

    @Test
    public void divZeroByZeroTest() {
        Operation operation = new DivOperation(0, 0);
        double result = operation.perform();
        assertThat(result, is(0.0));
    }

    @Test
    public void DivPositiveByNegativeTest() {
        Operation operation = new AddOperation(6, -3);
        double result = operation.perform();
        assertThat(result, is(-2.0));
    }

}