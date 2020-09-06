package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocatorTest {

    public static void main(String[] args) {

      // one main problem by ID is : ID can be dynamic (not static).
        WebDriver driver=WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickButton=driver.findElement(By.id("disappearing_button"));

        dontClickButton.click();


        driver.quit();
    }
}
