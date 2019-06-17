package Version06;

import Version06.NumberRepository.FileNumberRepository;
import Version06.NumberRepository.NumberRepository;
import Version06.Operation.*;

public class Main {

    public static void main(String[] args) {

        NumberRepository numberRepository = new FileNumberRepository();
        CalculatorApp calculatorApp = new CalculatorApp(numberRepository, args);
        calculatorApp.run();

    }
}
