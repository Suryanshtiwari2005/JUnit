package com.test.demo;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class TestException {

    @Test
    void testSortingArray_Exception(){
//        try {
            sortingArray s = new sortingArray();
//

//
//            int[] sortedArray = s.sortingArray(unsorted);
//
//        for(int ele:sortedArray){
//            System.out.println(ele);
//        }
//        System.out.println("Statements below exception");
//        //fail(); //for explecitliy failing the test case
//        }
//        catch(NullPointerException e){
//            System.out.println("Exception generated");
//        }

        int[] unsorted = null;
        assertThrows(NullPointerException.class,()->s.sortingArray(unsorted));
        //verifies that a specific block of code throws a particular type of exception
        //in this case it will throw null pointer exception
    }
}
