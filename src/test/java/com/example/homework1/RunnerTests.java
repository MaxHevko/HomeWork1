package com.example.homework1;


import com.example.homework1.reflection.annotations.TestType;
import org.junit.jupiter.api.Test;

public class RunnerTests {
    @Test
    @TestType(name = "smoke")
    public void isNotRealTest() {
        System.out.println("test");
    }
}
