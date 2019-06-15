package Version06;

import Version06.Inputs.CMDLineInputs;
import Version06.Inputs.Inputs;
import Version06.NumberRepository.FileNumberRepository;
import Version06.NumberRepository.NumberRepository;
import Version06.Operation.*;
import Version06.Outputs.ConsoleOutputs;
import Version06.Outputs.Outputs;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Inputs inputs = new CMDLineInputs(args);
        //first argument: add/sub/mul/div
        String operation = inputs.read();

        NumberRepository numberRepository = new FileNumberRepository();
        List<Double> inputNumbers = numberRepository.read();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation1 = operationFactory.getInstance(operation, inputNumbers);

        Outputs outputs = new ConsoleOutputs();
        outputs.show("The result is :  " + operation1.perform());
        outputs.show("Exiting the program...!!!");
    }
}
