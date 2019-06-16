package Version06.Operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SubOperationTest {

    @Test
    public void subPositiveFromPositiveTest() {
        Operation operation = new SubOperation(2, 3);
        double result = operation.perform();
        assertThat(result, is(-1.0));
    }

    @Test
    public void subPositiveFromZeroTest() {
        Operation operation = new SubOperation(2, 0);
        double result = operation.perform();
        assertThat(result, is(2.0));
    }

    @Test
    public void subNegativeFromZeroTest() {
        Operation operation = new SubOperation(-2, 0);
        double result = operation.perform();
        assertThat(result, is(-2.0));
    }

    @Test
    public void subNegativeFromNegativeTest() {
        Operation operation = new SubOperation(-2, -3);
        double result = operation.perform();
        assertThat(result, is(1.0));
    }

    @Test
    public void subZeroFromZeroTest() {
        Operation operation = new SubOperation(0, 0);
        double result = operation.perform();
        assertThat(result, is(0.0));
    }

    @Test
    public void subPositiveFromNegativeTest() {
        Operation operation = new SubOperation(2, -3);
        double result = operation.perform();
        assertThat(result, is(5.0));
    }

}