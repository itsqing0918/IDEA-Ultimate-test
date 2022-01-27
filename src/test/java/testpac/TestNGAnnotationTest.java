package testpac;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotationTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println(this.getClass().getName() + "beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println(this.getClass().getName() + "afterSuite");
    }

    @Test(dependsOnMethods = "test02", alwaysRun = true, description = "test01...")
    public void test01(){
        System.out.println("test01...");
//        Assert.assertEquals(true, false);
    }


    @Test
    public void test02(){
        System.out.println("test02...");
        Assert.assertEquals(true, true);
    }

    @Test(enabled = false)
    public void test03(){
        System.out.println("test03....");
    }
}
