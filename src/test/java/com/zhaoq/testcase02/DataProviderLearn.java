package com.zhaoq.testcase02;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLearn {

    @DataProvider(name = "user")
    public Object[][] Users(){
        return new Object[][]{
                {"root", "password"},
                {"cnblogs.com", "zhaoqing"},
                {"zhaoqing", "handsome"}
        };

    }

    @Test(dataProvider = "user")
    public void verifyUser(String username, String password){
        System.out.println("Username:" + username + " Password:" + password);
    }
}
