import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests maths on calculator class")
public class CalculatorTest {

    @DisplayName("Test 4/2 =2")
    @Test
    void integerDivision() {

        //first unit test
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4, 2);

        //alt + enter => import

        assertEquals(2, result, "this division is false");
       /* assertNotEquals();
        assertNull();
        assertThrows();
        assertDoesNotThrow();
        assertTrue();
        assertFalse();*/
    }

@DisplayName("Test 3-1 = 2")
    @Test
    void integerSoustract() {

        //first unit test
        Calculator calculator = new Calculator();
        int number1 = 8;
        int number2 = 5;

        int resulta = calculator.integerSoustract(8, 2);
        assertEquals(4, resulta, () -> number1 + "-" + number2 + "it's false");


    }


    //convention nommage
    @Test
    void testIntegerDivision_WhenFourDivisionDividedByTwo_ShouldReturnTwo() { }



    @Test
    void testIntegerSubstraction_When3minus1_ShouldReturnTwo() { }



}
