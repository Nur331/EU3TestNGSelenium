package com.cybertek.tests.day9_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {
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

driver.get("http://practice.cybertekschool.com/dropdown");

WebElement dropdownElement=driver.findElement(By.id("state"));

  Select  stateDropdown= new Select(dropdownElement);
// getOptions--> return all
        List<WebElement> options = stateDropdown.getOptions();
        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

    }

    @Test
    public void test2() throws InterruptedException {

  driver.get("http://practice.cybertekschool.com/dropdown");

  WebElement dropdownElement = driver.findElement(By.id("state"));
// 2.creat select object by passing that element as a constructor
  Select stateDropdown = new Select(dropdownElement);

  // verify that first selection is Select a state
  String expectedOption = "Select a State";
  String actualOption= stateDropdown.getFirstSelectedOption().getText();
  Assert.assertEquals(actualOption.toLowerCase(), expectedOption.toLowerCase(),"verify first selection");

// How to select Options from Dropdown?
//1. select from visible text
Thread.sleep(2000);
stateDropdown.selectByVisibleText("Virginia");

expectedOption="Virginia";
actualOption=stateDropdown.getFirstSelectedOption().getText();
Assert.assertEquals(actualOption, expectedOption, "verify first selected");


// 2.select using Index
 Thread.sleep(2000);
stateDropdown.selectByIndex(51);

 expectedOption="Wyoming";
 actualOption=stateDropdown.getFirstSelectedOption().getText();
 Assert.assertEquals(actualOption, expectedOption, "verify first selected");



//3. select by value
Thread.sleep(2000);
stateDropdown.selectByValue("TX");

 expectedOption="Texas";
 actualOption=stateDropdown.getFirstSelectedOption().getText();
Assert.assertEquals(actualOption, expectedOption, "verify first selected");






    }




}
