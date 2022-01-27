package com.zhaoq.demo02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testMain() {
        Fibonacci.main(new String[]{"args"});
    }

    @Test
    public void testFib() {
        int result = fibonacci.fib(0);
        Assert.assertEquals(result, 0);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme