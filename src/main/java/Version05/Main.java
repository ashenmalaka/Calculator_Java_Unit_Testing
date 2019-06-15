package Version05;

import Version05.Inputs.CMDLineInputs;
import Version05.Inputs.Inputs;
import Version05.NumberRepository.FileNumberRepository;
import Version05.NumberRepository.NumberRepository;
import Version05.Operation.*;
import Version05.Outputs.ConsoleOutputs;
import Version05.Outputs.Outputs;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Inputs inputs = new CMDLineInputs(args);
        //first argument: add/sub/mul/div
        String operation = inputs.read();

        NumberRepository numberRepository = new FileNumberRepository();
        List<Double> inputNumbers = numberRepository.read();

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

        Outputs outputs = new ConsoleOutputs();
        outputs.show("The result is :  " + operation1.perform());
        outputs.show("Exiting the program...!!!");
    }
}
