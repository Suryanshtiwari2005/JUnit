package com.test.demo;

public class ReverseString {

    public String ReverseString(String s){
        String ans= "";
        for(int i = s.length()-1; i>=0; i--){
            char character = s.charAt(i);
            ans += character;
        }
        return ans;
    }

}
