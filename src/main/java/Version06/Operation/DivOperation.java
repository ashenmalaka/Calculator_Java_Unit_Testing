package Version06.Operation;

public class DivOperation implements Operation {

    private final double number1;
    private final double number2;

    public DivOperation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public double perform() {
        return number1/number2;
    }
}
