package com.test.demo;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class ReverseStringTest {

    @Test
    public void test(){
        ReverseString st = new ReverseString();


        String result = assertTimeout(Duration.ofMillis(1),()->st.ReverseString("The quick brown fox jumps over the lazy dog"));
        assertEquals("god yzal eht revo spmuj xof nworb kciuq ehT",result,"The String should be reversed Correctly");
    }
}
