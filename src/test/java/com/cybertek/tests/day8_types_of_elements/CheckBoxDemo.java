package com.cybertek.tests.day8_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {


    @Test
public void test1() throws InterruptedException {
WebDriver driver = WebDriverFactory.getDriver("chrome");
driver.manage().window().maximize();

driver.get("http://practice.cybertekschool.com/checkboxes");

WebElement checkBox1=driver.findElement(By.xpath("//input[1]"));
WebElement checkBox2=driver.findElement(By.xpath("//input[2]"));


// how to verify checkbox is selected ?
 System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
 System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

checkBox1.click();

Assert.assertTrue(checkBox1.isSelected(), "verify that checkBox1 is selected");
Assert.assertTrue(checkBox2.isSelected(), "verify that checkBox2 is selected");

Thread.sleep(2000);
driver.quit();

    }











}
