package Version06;

import Version06.Inputs.CMDLineInputs;
import Version06.Inputs.Inputs;
import Version06.NumberRepository.NumberRepository;
import Version06.Operation.Operation;
import Version06.Operation.OperationFactory;
import Version06.Outputs.ConsoleOutputs;
import Version06.Outputs.Outputs;

import java.util.List;

public class CalculatorApp {

    private NumberRepository numberRepository;
    private String[] args;

    public CalculatorApp(NumberRepository numberRepository,String[] args) {

        this.numberRepository = numberRepository;
        this.args = args;

    }

    public void run(){

        Inputs inputs = new CMDLineInputs(args);
        //first argument: add/sub/mul/div
        String operation = inputs.read();

        List<Double> inputNumbers = numberRepository.read();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation1 = operationFactory.getInstance(operation, inputNumbers);

        Outputs outputs = new ConsoleOutputs();
        outputs.show("The result is :  " + operation1.perform());
        outputs.show("Exiting the program...!!!");

    }
}
