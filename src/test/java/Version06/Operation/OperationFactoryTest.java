package Version06.Operation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class OperationFactoryTest {

    @Test
    public void shouldReturnAddOperation(){

        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("add",inputNumbers);
        //verify operation is an instance of AddOperation class
        assertThat(operation,instanceOf(AddOperation.class));

    }

}