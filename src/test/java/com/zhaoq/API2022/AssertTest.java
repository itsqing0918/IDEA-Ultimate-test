package com.zhaoq.API2022;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 斷言使用的測試用例
 *
 */
public class AssertTest {

    @Test
    public void testAssert(){
        Assert.assertEquals(1,10);
        Assert.assertEquals(true,true);
    }
}
