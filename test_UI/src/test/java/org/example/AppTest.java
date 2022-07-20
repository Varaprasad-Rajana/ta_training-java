package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void openGooglePageTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varaprasad_Rajana.EPAM\\IdeaProjects\\ta_training-java\\new\\test_UI\\src\\test\\resources\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.close();
        driver.quit();
    }
    @Test
    public void searchTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varaprasad_Rajana.EPAM\\IdeaProjects\\ta_training-java\\new\\test_UI\\src\\test\\resources\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement searchField = driver.findElement(By.name("q"));
        Assert.assertTrue(searchField.isDisplayed());
        driver.close();
        driver.quit();
    }


}

