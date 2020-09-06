package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tagnameLocator {
    public static void main(String[] args) throws InterruptedException {


    WebDriver driver= WebDriverFactory.getDriver("chrome");

    driver.manage().window().maximize();

   driver.get("http://practice.cybertekschool.com/sign_up");


driver.findElement(By.tagName("input")).sendKeys("Mike Smith with Tagname");

driver.findElement(By.name("email")).sendKeys("mike@smith.com");

driver.findElement(By.tagName("button")).click();

   Thread.sleep(3000);

   driver.quit();


    }
}
