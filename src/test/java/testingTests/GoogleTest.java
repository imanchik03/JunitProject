package testingTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void googleTest1(){
        System.out.println("this is google test 1");
        Assert.assertTrue(5 > 2);
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");
    }
    @Test
    public void googleTest2(){
        System.out.println("this is google test 222");
    }
}
