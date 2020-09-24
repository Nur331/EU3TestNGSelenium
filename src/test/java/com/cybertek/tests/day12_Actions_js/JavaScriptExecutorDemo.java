package com.cybertek.tests.day12_Actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorDemo {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test(){

    }


    @Test
    public void clickWithJS(){

        driver.get("http://practice.cybertekschool.com/");

        WebElement dropDownLink=driver.findElement(By.linkText("Dropdown"));

        // this is how to click with  JS
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript( "arguments[0].click();", dropDownLink);



    }


// using JS Write in disable input box
@Test
    public void typeWithJS(){

driver.get("http://practice.cybertekschool.com/dynamic_controls");
WebElement inputBox=driver.findElement(By.cssSelector("#input-example>input"));

// type in disable input box using JS
JavascriptExecutor jse=(JavascriptExecutor)driver;

String text= "Hello Disabled Input";

jse.executeScript("arguments[0].setAttribute('value','"+text+"')", inputBox);


    }


@Test
    public void ScrollDownAndUp() throws InterruptedException {

driver.get("http://practice.cybertekschool.com/infinite_scroll");
driver.manage().window().maximize();

JavascriptExecutor jse=(JavascriptExecutor)driver;

// scroll down
    for (int i = 0; i <10; i++) {
        Thread.sleep(1000);
        jse.executeScript("window.scrollBy(0,100)");

}

// scroll up
    for (int i = 0; i <10; i++) {
         Thread.sleep(1000);
        jse.executeScript("window.scrollBy(0,-100)" );
    }


    }


    // sroll to element directly

@Test
    public void scrollToElemenet() throws InterruptedException {

    driver.get("https://www.amazon.com/ref=nav_logo");
    WebElement eng = driver.findElement(By.id("icp-touch-link-language"));
    Thread.sleep(2000);
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    jse.executeScript("arguments[0].scrollIntoView(true);", eng);

}









}
