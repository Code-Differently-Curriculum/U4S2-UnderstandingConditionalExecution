package com.codedifferently.labs.partA.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WatchMovieTest {
    @Test
    public void movieTest01(){
        String expected= "I’m interested in watching the movie";
        String actual = WatchMovie.watchMovie();
        Assertions.assertEquals(expected,actual);

    }
}
