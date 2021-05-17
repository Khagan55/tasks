package fragments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumSmallestNumbersTest {

    private SumSmallestNumbers sumSmallestNumbers;

    @BeforeEach
    void setUp() {
        sumSmallestNumbers = new SumSmallestNumbers();
    }

    @ParameterizedTest
    @MethodSource("numbers")
    void sumSmallestNumbersTest(List<Integer> numbers, int expectedSum) {
        //arrange & act
        int result = sumSmallestNumbers.sumSmallestNumbers(numbers);

        //assert
        assertEquals(expectedSum, result);
    }

    private static Stream<Arguments> numbers() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4), 3),
                Arguments.of(List.of(6, 7, 56, 2, 9, 34 ,3), 5),
                Arguments.of(List.of(4, 4), 8),
                Arguments.of(List.of(5, 38, 15, 1, 1, -19, 9), -18),
                Arguments.of(List.of(1, 1, 1, 1), 2)
        );
    }
}