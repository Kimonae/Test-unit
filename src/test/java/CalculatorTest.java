import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void integerDivision() {

        //first unit test
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4,2);
        int resulta = calculator.integerSoustract(8,2);
        //alt + enter => import
        assertEquals(2, result, "it's false");
        assertEquals(4, result, "it's false");
       /* assertNotEquals();
        assertNull();
        assertThrows();
        assertDoesNotThrow();
        assertTrue();
        assertFalse();*/
    }
}
