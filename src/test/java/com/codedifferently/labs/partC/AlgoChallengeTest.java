package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoChallengeTest {
    // Problem 10 Test
    @Test
    public void containETest01() {

        // Given
        String str = "Hello";

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containETest02() {

        // Given
        String str = "Heelle";

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containETest03() {

        // Given
        String str = "Heelele";

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 11
    @Test
    public void everyOtherTest01(){

        // Given
        String word = "Miracle";
        int number = 2;

        // When
        String expected = "Mrce";
        String actual = AlgoChallenge.everyOther(word, number);
    }

    @Test
    public void everyOtherTest02(){

        // Given
        String word = "abcdefg";
        int number = 2;

        // When
        String expected = "aceg";
        String actual = AlgoChallenge.everyOther(word, number);
    }

    @Test
    public void everyOtherTest03(){

        // Given
        String word = "abcdefg";
        int number = 3;

        // When
        String expected = "adg";
        String actual = AlgoChallenge.everyOther(word, number);
    }
}
