package com.codedifferently.labs.partA.ex02;

import com.codedifferently.labs.partA.ex01.WatchMovie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TernaryOperatorTest {
    @Test
    public void ternaryTest01(){
        String expected= "After if stmt, x = 13";
        String actual = TernaryOperator.modify();
        Assertions.assertEquals(expected,actual);

    }
}
