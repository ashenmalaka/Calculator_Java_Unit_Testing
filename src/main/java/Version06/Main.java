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

        NumberRepository numberRepository = new FileNumberRepository();
        CalculatorApp calculatorApp = new CalculatorApp(numberRepository, args);
        calculatorApp.run();

    }
}
