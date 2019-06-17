package Version06;

import Version06.NumberRepository.NumberRepository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculatorAppTest {

    @Test
    public void testCase1(){

        //mock a NumberRepository
        NumberRepository numberRepository = mock(NumberRepository.class);
        List<Double> numbers = new ArrayList<>();
        numbers.add(20.0);
        numbers.add(30.0);
        when(numberRepository.read()).thenReturn(numbers);

        String[] args = {"add"};
        CalculatorApp calculatorApp = new CalculatorApp(numberRepository,args);

        calculatorApp.run();
        //verify(numberRepository.read());

    }

}