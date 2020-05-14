import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CalculatorTest {

    @Test
    public void testMain() {
        PrintStream oldOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Calculator.main(new String[] {"1", "4"});
        System.setOut(oldOut);
        String systemOutput = baos.toString();
        char actualOutput = systemOutput.charAt(0);
        char expectedOutput = '5';
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}


