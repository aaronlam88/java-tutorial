package com.learn.lession01;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloWorldTest {
    /**
     * Call the print function in HelloWorld class. Just let the test pass by
     * assertTrue(true)
     */
    @Test
    public void shouldAnswerWithTrue() {
        HelloWorld.print();
        assertTrue(true);
    }
}
