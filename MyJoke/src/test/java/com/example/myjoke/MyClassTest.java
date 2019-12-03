package com.example.myjoke;

import static org.junit.Assert.*;
import org.junit.Test;


public class MyClassTest {
    @Test
    public void test() {
        MyClass joker = new MyClass();
        assert joker.getJoke().length() != 0;
    }
}