package Version04;

import Version04.Inputs.CMDLineInputs;
import Version04.Inputs.Inputs;
import Version04.NumberRepository.FileNumberRepository;
import Version04.NumberRepository.NumberRepository;
import Version04.Operation.*;
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

        if ("add".equals(operation)){
            operation1 = new AddOperation(inputNumbers.get(0),inputNumbers.get(1));
        }
        else if("sub".equals(operation)){
            operation1 = new SubOperation(inputNumbers.get(0),inputNumbers.get(1));
        }
        else if("mul".equals(operation)){
            operation1 = new MulOperation(inputNumbers.get(0),inputNumbers.get(1));
        }
        else if("div".equals(operation)){
            operation1 = new DivOperation(inputNumbers.get(0),inputNumbers.get(1));
        }
        else{
            System.out.println("Invalid INPUT...!!!");
        }

        System.out.println("The result is : " +operation1.perform());
    }
}
