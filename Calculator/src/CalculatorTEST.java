import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTEST {
    @Test
    public  void sumTEST(){
        Assertions.assertEquals(Calculator.calculator(2, 3, "+"),5);
    }
    @Test
    public  void subtractionTEST(){
        Assertions.assertEquals(Calculator.calculator(2, 3, "-"),-1);
    }
    @Test
    public  void multiplicationTEST(){
        Assertions.assertEquals(Calculator.calculator(2, 3, "*"),6);
    }
    @Test
    public  void divisionTEST(){
        Assertions.assertEquals(Calculator.calculator(3, 3, "/"),1);
    }
    @Test
    public  void degreeTEST(){
        Assertions.assertEquals(Calculator.calculator(2, 3, "^"),8);
    }

}

