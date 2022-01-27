package com.zhaoq.API;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {

    @Test
    public void testAssert(){
        Assert.assertEquals(1,1);
        Assert.assertEquals(2,2);
    }
}
