import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests maths on calculator class")
public class CalculatorTest {
 static Calculator calculator;
    @BeforeAll
    static void setup() {
        System.out.println("Executing @BeforeAll method");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Excuting @Afterall method");

    }

    @BeforeEach
    void beforeEachTestMethod() {
        System.out.println("Excuting @BeforeEach method");

    }
    @AfterEach
    void afterEachTestMethod() {
        calculator = new Calculator();
        System.out.println("Excuting @AfterEach method");


    }



    @DisplayName("Test 4/2 =2")
    @Test
    void testIntegerDivision_WhenFourDivisionDividedByTwo_ShouldReturnTwo() {

        //first unit test

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
    void testIntegerSubstraction_When3minus1_ShouldReturnTwo() {

        //first unit test

        int number1 = 8;
        int number2 = 5;

        int resulta = calculator.integerSoustract(number1, number2);
        assertEquals(4, resulta, () -> number1 + "-" + number2 + "it's false");


    }


    //convention nommage
   /* @Test
    void testIntegerDivision_WhenFourDivisionDividedByTwo_ShouldReturnTwo() { }

    @Test
    void testIntegerSubstraction_When3minus1_ShouldReturnTwo() { }*/



}
