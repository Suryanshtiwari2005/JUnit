package com.test.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {

    @Test
    void testcomputeSquareArea(){
        Shapes shape = new Shapes();

        assertEquals(576,shape.computeSquareArea(24));

    }
}
