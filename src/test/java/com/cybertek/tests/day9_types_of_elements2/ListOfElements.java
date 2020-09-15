package com.cybertek.tests.day9_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {
WebDriver driver;
@BeforeMethod
    public void setUp(){

    driver= WebDriverFactory.getDriver("chrome");

}

@AfterMethod
    public void tearDown() throws InterruptedException {
    Thread.sleep(2000);
    driver.quit();
}

@Ignore
@Test
    public void test(){

}

@Test
    public void test1(){

driver.get("http://practice.cybertekschool.com/multiple_buttons");


List<WebElement> buttons= driver.findElements(By.tagName("button"));

    System.out.println("buttons.size() = " + buttons.size());

    Assert.assertEquals(buttons.size(), 6,"verify buttons size");

    for (WebElement button : buttons) {
 System.out.println("button.isDisplayed() = " + button.isDisplayed());
Assert.assertTrue(button.isDisplayed(), "verify that buttons are displayed");

    }
  //  click on button 2
    buttons.get(1).click();

}


    @Test
    public void test2(){
 driver.get("http://practice.cybertekschool.com/multiple_buttons");
// regular findElement method will throw NSE if locator does not exist
 List<WebElement> buttons= driver.findElements(By.tagName("button"));


//List<WebElement> buttons = driver.findElements(By.tagName("buttonaiysdgausda"));
//by findElementS method, passing locator which does not exist, it will NOT throw NSE.
//ALT+enter or OPTION+enter , ten one more enter for shortcut to create a variable.

        System.out.println("buttons.size() = " + buttons.size());
    }
















}
