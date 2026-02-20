package com.test.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBeforeAfter {

    Shapes shape;

    //before Each test this method will be exceuted using annotation @BeforeEach(JUnit5) @Before(JUnit4)
    @BeforeEach
    void initializee(){
        shape = new Shapes();
        System.out.println("Before test");
    }

    @Test
    void testComputeSquareArea(){
        assertEquals(78.5,shape.computeCircleArea(5));
        System.out.println("Actual Test Running1");
    }

    @Test
    void testComputeCircleArea(){
        assertEquals(78.5,shape.computeCircleArea(5));
        System.out.println("Actual Test Running2");
    }

    //after Each test this method will Run using annotation @AfterEach(JUnit5) @After(JUnit4)
    @AfterEach
    void destroy(){
        System.out.println("After Test Exceution for CleanUp or for Closing the Resource");
    }
}
