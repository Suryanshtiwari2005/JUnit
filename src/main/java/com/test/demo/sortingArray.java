package com.test.demo;

import java.util.Arrays;

public class sortingArray {

    public int[] sortingArray(int[] array){

        for(int i = 0; i<1000000; i++){
            Arrays.sort(array);
        }

        return array;
    }

}
