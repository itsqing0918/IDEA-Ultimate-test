import org.junit.Assert;
import org.junit.Test;

public class TestAnnotation {

    @Test//(groups = "group1")
    public void test1(){
        System.out.println("test1 from group1");
        Assert.assertTrue(true);
    }
}
