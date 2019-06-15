package Version06.NumberRepository;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNumberRepository implements NumberRepository {
    @Override
    public List<Double> read() {

        List<Double> inputNumbers = new ArrayList<>();
        List<String> inputNumbersStrs = null;
        try{
            inputNumbersStrs = Files.readAllLines(Paths.get("C:\\Users\\User\\IdeaProjects\\CalculatorNew\\src\\numbers.txt"));
            for (String inputNumberStr : inputNumbersStrs) {
                inputNumbers.add(Double.parseDouble(inputNumberStr));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return inputNumbers;
    }
}
