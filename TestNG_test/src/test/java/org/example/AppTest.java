package org.example;


import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void login()
    {
        Assert.assertTrue(true);
        System.out.println("Testing");
    }

    /*@Test(dependsOnMethods = "login")
    public void shouldAnswer()
    {
        System.out.println("Selenium");
    }*/
    @Test
    public void shouldAnswer()
    {
        System.out.println("Selenium");
    }
    @BeforeSuite
    public void suit()
    {
        System.out.println("Be suite");
    }
    @BeforeClass
    public void bClass()
    {
        System.out.println("Before class");
    }
    @BeforeTest
    public void bTest()
    {
        System.out.println("Before test");
    }
    // day2 continued class
    @Test(groups = {"Kids Wear"})
    public void test1()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("One", "Two");
        System.out.println("Print true or not");
        softAssert.assertEquals("One", "One");
        softAssert.assertEquals("Two", "Two");
        System.out.println("Print true or not after");
        softAssert.assertAll("Test Message");
        System.out.println("a1bc");
    }
    @Test(groups = {"Fashion"})
    public void test2()
    {
        System.out.println("ab2c");
    }
@Parameters(value = {"browser"})
    @Test
    public void test3(String browser)
    {
        Assert.assertTrue( true);
        System.out.println("abc3"+browser);
    }
}
