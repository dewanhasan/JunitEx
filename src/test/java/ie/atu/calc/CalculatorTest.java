package ie.atu.calc;

import ie.atu.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc = new Calculator();
    @Test
    void testAdd()
    {
        myCalc=new Calculator();
        assertEquals(40, myCalc.add(20,20));

    }
}
