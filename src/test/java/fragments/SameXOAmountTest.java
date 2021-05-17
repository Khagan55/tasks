package fragments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SameXOAmountTest {
    private SameXOAmount sameXOAmount;

    @BeforeEach
    void setUp() {
        sameXOAmount = new SameXOAmount();
    }

    @ParameterizedTest
    @MethodSource("texts")
    void calculateTest(String text, boolean expectedSum) {
        //arrange & act
        boolean result = sameXOAmount.sameXOAmount(text);

        //assert
        assertEquals(expectedSum, result);
    }

    private static Stream<Arguments> texts() {
        return Stream.of(
                Arguments.of("xXoO", true),
                Arguments.of("aAxXXbBoOo", true),
                Arguments.of("abc", true),
                Arguments.of("OaAxXbBoO", false),
                Arguments.of("xgXoXsdxOxz", false),
                Arguments.of("aaAmmMxMM", false)
        );
    }
}


