package fragments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindOddAmountTest {
    private FindOddAmount findOddAmount;

    @BeforeEach
    void setUp() {
        findOddAmount = new FindOddAmount();
    }

    @ParameterizedTest
    @MethodSource("numbers")
    void sumSmallestNumbersTest(List<Integer> numbers, int expectedAmount) {
        //arrange & act
        int result = findOddAmount.findOddAmount(numbers);

        //assert
        assertEquals(expectedAmount, result);
    }

    private static Stream<Arguments> numbers() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 2, 3, 3), 1),
                Arguments.of(List.of(8, 8, 7, 7, 7), 7),
                Arguments.of(List.of(10, 3, 3, 10, 6, 10, 6, 1, 1), 10)

        );
    }

}