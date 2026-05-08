import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculatorTestObject ;

    @BeforeEach
    void setUp() {
        // setup code
        calculatorTestObject = new Calculator();
    }

    @AfterEach
    void tearDown() {
        // code to release resources
        System.out.println("Method resources released");
    }

    @DisplayName("Test square of a number with valid values.")
    @ParameterizedTest
    @ValueSource(ints={1,2,10,-1})
    void testSquareOfSingleIntegerNumber(int numberPassed) {
        long actualResult = calculatorTestObject.squareOfSingleIntegerNumber(numberPassed);
        long expectedResult = numberPassed*numberPassed;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    @DisplayName("Test addition of int within range returns success,")
    void testAddingOfTwoIntegerNumbersWithinIntegerRange() {
        
        // call method being tested with test data
        int resultReturned = calculatorTestObject.addTwoIntegerNumbers(5,10);

        // check if actual value is equal to expected value
        assertEquals( 15, resultReturned);
    }

    @DisplayName("Test square of a number with invalid values has exception")
    @ParameterizedTest
    @ValueSource(ints={Integer.MAX_VALUE, Integer.MIN_VALUE})
    void testSquareOfSingleIntegerNumberOutsideIntegerRangeHasException(int numberPassed) {
        assertThrows(ArithmeticException.class, () -> {
            calculatorTestObject.squareOfSingleIntegerNumber(numberPassed);
        });
    }

    @DisplayName("Test square of a number with valid values but changed actual is not equal")
    @ParameterizedTest
    @ValueSource(ints={2, 45, 66, 77})
    void testSquareOfSingleIntegerNumberInRangeDeviatesResult(int numberPassed) {
        int expectedResult = numberPassed * numberPassed ;
        int actualResult =  calculatorTestObject.squareOfSingleIntegerNumber(numberPassed) + 1;

        assertNotEquals(expectedResult, actualResult);
    }
    
    @DisplayName("Test division of int within range returns success")
    @ParameterizedTest
    @CsvSource({"6,2,3", "12, 5, 2", "15, 3, 5"})
    void testDivideTwoIntegerNumbersWithinRangeReturnsSuccesss(int number1, int number2, int expectedResult) {
        int actualResult =  calculatorTestObject.divideTwoIntegerNumbers(number1,number2);

        assertEquals(expectedResult, actualResult);

    }

}
