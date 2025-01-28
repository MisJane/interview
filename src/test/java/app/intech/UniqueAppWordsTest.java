package app.intech;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueAppWordsTest {

    @Test
    void testReplaceAllA() {
        List<String> input = List.of("ANNA", "ann4", "-1");
        List<String> result = UniqueAppWords.process(input);
        assertThat(result).containsExactly("4NN4", "-1");
    }

    @Test
    void testUppercaseAReplacement() {
        List<String> input = List.of("APPLE", "aPpLe");
        List<String> result = UniqueAppWords.process(input);
        assertThat(result).containsExactly("4PPLE");
    }

    @Test //можно обойтись без этого тривиального теста
    void testNullHandling() {
        List<String> input = Arrays.asList(null, "test", null);
        List<String> result = UniqueAppWords.process(input);
        assertThat(result).containsExactly("TEST");
    }

    @Test
    void testMixedCaseAndDigits() {
        List<String> input = List.of("a1B2c", "A1b2C");
        List<String> result = UniqueAppWords.process(input);
        assertThat(result).containsExactly("41B2C");
    }
}