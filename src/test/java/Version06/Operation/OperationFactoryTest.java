package Version06.Operation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.dynalink.support.Guards.isNull;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
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

    @Test
    public void shouldReturnSubOperation(){

        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("sub",inputNumbers);
        assertThat(operation,instanceOf(SubOperation.class));

    }

    @Test
    public void shouldReturnMulOperation(){

        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("mul",inputNumbers);
        assertThat(operation,instanceOf(MulOperation.class));

    }

    @Test
    public void shouldReturnDivOperation(){

        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("div",inputNumbers);
        assertThat(operation,instanceOf(DivOperation.class));

    }

    @Test
    public void shouldReturnNull(){

        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("mod",inputNumbers);
        assertThat(operation,is(isNull()));

    }




}