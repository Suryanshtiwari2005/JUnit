package com.test.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTesting {

    @Test
    void TestArrays(){
        int[] expected = {3,2,5,4};

        int[] actual = {3,2,5,4};

        assertArrayEquals(expected,actual,()->"Both array's are not Equal");
        //will check data inside the array during testing

        //assertEquals(expected,actual);
        //will check reference variable inside heap memory of both array i.e. different
    }

    // mvn test -Dtest=ArrayTesting-> for running test if particular class through terminal
}
