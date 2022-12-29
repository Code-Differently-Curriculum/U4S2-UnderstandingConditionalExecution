package com.codedifferently.labs.partA.ex03;

import com.codedifferently.labs.partB.ex01.CheckGrades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputeFairTest {

    @Test
    public void IndexingTest01(){
        int age = 27;
        String expected = "fare=5$";
        int actual = ComputeFare.compute( age);
        Assertions.assertEquals(expected, actual);
    }
}
