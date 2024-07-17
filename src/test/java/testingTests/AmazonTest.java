package testingTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AmazonTest {
    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("THIS IS BEFORE SUITE FROM AMAZON");
    }
    @Test
    public void amazonTest1(){
        System.out.println("AMAZON TEST 1");
    }
    @Test
    public void amazonTest2(){
        System.out.println("AMAZON TEST 2");
    }

    @BeforeSuite
    public static void beforeSuite1(){
        System.out.println("THIS IS BEFORE SUITE FROM AMAZON");
    }
    @Test
    public void amazonTest3(){
        System.out.println("AMAZON TEST 3");
    }
}
