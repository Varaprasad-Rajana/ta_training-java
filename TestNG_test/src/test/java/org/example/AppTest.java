package org.example;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
}
