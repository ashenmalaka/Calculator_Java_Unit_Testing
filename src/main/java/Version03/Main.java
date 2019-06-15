package Version03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Inputs inputs = new CMDLineInputs(args);
        //first argument: add/sub/mul/div
        
        String operation = inputs.read();

        NumberRepository numberRepository = new FileNumberRepository();
        List<Double> inputNumbers = numberRepository.read();

            if ("add".equals(operation)){
                System.out.println(inputNumbers.get(0)+inputNumbers.get(1));
            }
            else if("sub".equals(operation)){
                System.out.println(inputNumbers.get(0)-inputNumbers.get(1));
            }
            else if("mul".equals(operation)){
                System.out.println(inputNumbers.get(0)*inputNumbers.get(1));
            }
            else if("div".equals(operation)){
                System.out.println(inputNumbers.get(0)/inputNumbers.get(1));
            }
    }
}
