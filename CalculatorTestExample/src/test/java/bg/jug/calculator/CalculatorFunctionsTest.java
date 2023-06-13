package bg.jug.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorFunctionsTest {

    @ParameterizedTest
    @CsvSource({
            "5, 7, 12",
            "0, 0, 0",
            "-5, 7, 2"
    })
    void testAdditionWithCsvSource(int a, int b, int expected) {
        int result = Calculator.add(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 3, 7",
            "0, 0, 0",
            "-5, -2, -3"
    })
    void testSubtractionWithScvSource(int a, int b, int expected) {
        int result = Calculator.subtract(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 6, 24",
            "0, 0, 0",
            "-5, 2, -10"
    })
    void testMultiplicationWithCsvSource(int a, int b, int expected) {
        int result = Calculator.multiply(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 2, 2",
            "0, 5, 0",
            "10, 3, 3"
    })
    void testDivision(int a, int b, int expected) {
        int result = Calculator.divide(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 0",
            "10, 0",
            "0, 0"
    })
    void testDivisionByZero(int a, int b) {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(a, b));
    }


    //@ParameterizedTests
    @ParameterizedTest
    @MethodSource("additionArguments")
    void testAdditionWithStreams(int a, int b, int expected) {
        int result = Calculator.add(a, b);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> additionArguments() {
        return Stream.of(
                Arguments.of(5, 7, 12),
                Arguments.of(0, 0, 0),
                Arguments.of(-5, 7, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("subtractionArguments")
    void testSubtractionWithStreams(int a, int b, int expected) {
        int result = Calculator.subtract(a, b);
        assertEquals(expected, result);
    }
    
    private static Stream<Arguments> subtractionArguments() {
        return Stream.of(
                Arguments.of(10, 3, 7),
                Arguments.of(0, 0, 0),
                Arguments.of(-5, -2, -3)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplicationArguments")
    void testMultiplicationWithStreams(int a, int b, int expected) {
        int result = Calculator.multiply(a, b);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> multiplicationArguments() {
        return Stream.of(
                Arguments.of(4, 6, 24),
                Arguments.of(0, 0, 0),
                Arguments.of(-5, 2, -10)
        );
    }

    @ParameterizedTest
    @MethodSource("divisionArguments")
    void testDivisionWithStreams(int a, int b, int expected) {
        int result = Calculator.divide(a, b);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> divisionArguments() {
        return Stream.of(
                Arguments.of(4, 2, 2),
                Arguments.of(0, 5, 0),
                Arguments.of(10, 3, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("divisionByZeroArguments")
    void testDivisionByZeroWithStreams(int a, int b) {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(a, b));
    }

    private static Stream<Arguments> divisionByZeroArguments() {
        return Stream.of(
                Arguments.of(4, 0),
                Arguments.of(10, 0),
                Arguments.of(0, 0)
        );
    }


    //Normal manual @Tests one by one
    @Test
    void testAddition() {
        //given
        int a = 5;
        int b = 7;
        int expected = 12;

        //when
        int result = Calculator.add(a,b);

        //then
        assertEquals(expected, result);
    }

    @Test
    void testSubtraction() {
        //given
        int a = 10;
        int b = 3;
        int expected = 7;

        //when
        int result = Calculator.subtract(a, b);

        //then
        assertEquals(expected, result);
    }

    @Test
    void testMultiplication() {
        //given
        int a = 4;
        int b = 6;
        int expected = 24;

        //when
        int result = Calculator.multiply(a, b);

        //then
        assertEquals(expected, result);
    }
}
