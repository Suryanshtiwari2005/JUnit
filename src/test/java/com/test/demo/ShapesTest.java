package com.test.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {
    Shapes shape = new Shapes();

    @Test
    void testcomputeSquareArea(){
        assertEquals(576,shape.computeSquareArea(24));
    }

    @Test
    void testcomputeCircleArea(){
        assertEquals(314,shape.computeCircleArea(10),"Area of Circle Calculation is right");
        //string message is evaluated even if testcase  passes or fails
    }

    @Test
    void testcomputeCircleAreaSupplier(){
        assertEquals(314,shape.computeCircleArea(10),()->"Area of Circle Calculation is wrogn");
        //string message is evaluated only if test case is failing
    }
}
