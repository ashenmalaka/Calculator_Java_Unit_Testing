package Version06.Operation;

import java.util.List;

public class OperationFactory {

    public Operation getInstance(String operation, List<Double> inputNumbers){

        Operation operation1 = null;

        if ("add".equals(operation)) {
            operation1 = new AddOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("sub".equals(operation)) {
            operation1 = new SubOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("mul".equals(operation)) {
            operation1 = new MulOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("div".equals(operation)) {
            operation1 = new DivOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else {
            System.out.println("Invalid INPUT...!!!");
        }

        return operation1;
    }
}
