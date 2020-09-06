package com.cybertek.tests.day8_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {


    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement BlueRadioButton=driver.findElement(By.cssSelector("#blue"));
        WebElement redButton=driver.findElement(By.id("red"));

        System.out.println("BlueRadioButton.isSelected() = " + BlueRadioButton.isSelected());
        System.out.println("redButton.isSelected() = " + redButton.isSelected());


        // verify blue is selected red is not selected
        // red
        // blue

Assert.assertTrue(BlueRadioButton.isSelected(), "verify that blue is selected");

Assert.assertFalse(redButton.isSelected(), "verify that red button not selected ");

redButton.click();

Assert.assertFalse(BlueRadioButton.isSelected(), "verify that blue is NOT selected");

Assert.assertTrue(redButton.isSelected(), "verify that red button selected ");





        Thread.sleep(3000);
        driver.quit();
    }




















}
