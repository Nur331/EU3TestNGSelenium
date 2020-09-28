package com.cybertek.tests.day12_Actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class HoverTest {

    /**
     * hover over each image in he website
     * verify each name: user text is displayed
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test() {

    }
      @Test
    public void test1() throws InterruptedException {


        driver.get("http://practice.cybertekschool.com/hovers");

          for (int i = 1; i <= 3; i++) {

            //  WebElement img1 = driver.findElement(By.tagName("img"));


              String xpathImg="(//img)["+i+"]";
              WebElement img=driver.findElement(By.xpath(xpathImg));
              System.out.println("xpathImg = " + xpathImg);

              Actions actions = new Actions(driver);
              Thread.sleep(2000);
              actions.moveToElement(img).perform();



              String textXpath="//h5[.='name: user"+i+"']";
              WebElement text1=driver.findElement(By.xpath(textXpath));
              System.out.println("textXpath = " + textXpath);
              Assert.assertTrue(text1.isDisplayed(), "verify user "+i+" is displayed");











          }




    }






















}
