package Version02;

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
        List<Double> inputNumbers = new ArrayList<>();

        try{
            List<String> inputNumberStrs = Files.readAllLines(Paths.get("C:\\Users\\User\\IdeaProjects\\CalculatorNew\\src\\numbers.txt"));
            for (String inputNumberStr : inputNumberStrs) {
                inputNumbers.add(Double.parseDouble(inputNumberStr));
            }

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

        }catch(IOException e){
            e.printStackTrace(); //bad
        }
    }
}
