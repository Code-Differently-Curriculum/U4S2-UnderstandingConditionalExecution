package com.codedifferently.labs.partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TernaryTest {
    @Test
    public void IndexingTest01(){
        String expected = "Value of y is: 90\n" +
                "Value of y is: 61";
        String actual = Ternary.ternary();
        Assertions.assertEquals(expected, actual);
    }
}
