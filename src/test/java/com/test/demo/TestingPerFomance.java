package com.test.demo;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


public class TestingPerFomance {

    //@Test(timeout = 100) for JUnit4 we have to specify here

    @Test
    void testSortingMethod_Performance(){
        sortingArray s = new sortingArray();

        int[] unsorted = {2,6,4};

        assertTimeout(Duration.ofMillis(10),()->s.sortingArray(unsorted),"Can not Complete task in given duration");
        //through assertTimeout we can check performance of a Unit(only in JUnit5)
    }
}
