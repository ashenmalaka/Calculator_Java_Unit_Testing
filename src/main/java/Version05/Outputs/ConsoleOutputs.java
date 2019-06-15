package Version05.Outputs;

public class ConsoleOutputs implements Outputs {


    @Override
    public void show(String text) {
        System.out.println(text);
    }
}
