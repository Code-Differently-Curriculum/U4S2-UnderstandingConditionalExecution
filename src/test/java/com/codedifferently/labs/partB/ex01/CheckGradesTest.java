package com.codedifferently.labs.partB.ex01;

import com.codedifferently.labs.partB.ex02.Ternary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckGradesTest {

    @Test
    public void IndexingTest01(){
        String expected = "What was your grade in Math?\n" +
                "80\n" +
                "What was your grade in Science?\n" +
                "75\n" +
                "What was your grade in Geography?\n" +
                "80\n" +
                "What was your grade in English?\n" +
                "75\n" +
                "What was your grade in Java?\n" +
                "80\n" +
                "Total grade in five subjects: 390.0\n" +
                "My percentage: 78.0";
        String actual = CheckGrades.checkGrades();
        Assertions.assertEquals(expected, actual);
    }
}
