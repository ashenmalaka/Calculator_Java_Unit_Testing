package Version05.Operation;

public class MulOperation implements Operation {

    private final double number1;
    private final double number2;

    public MulOperation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public double perform() {
        return number1*number2;
    }
}
