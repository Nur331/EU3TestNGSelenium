package com.cybertek.tests.day10_PopUps_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iframeTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");


        driver.switchTo().frame("mce_0_ifr");

        Thread.sleep(2000);
        // clear before send keys
        driver.findElement(By.cssSelector("#tinymce")).clear();
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("Mike Smith");


// goes back to first frame(main html)
// goes back to first frame, useful when we have switched multiple frames
driver.switchTo().defaultContent();
// an other way to go back to parent frame is :
        //driver.switchTo().parentFrame();

   // 2. switch with index
// main html don't count in another  html, so here we tel only from siblings html!
   driver.switchTo().frame(0);

 //  driver.switchTo().parentFrame();



        Thread.sleep(2000);
// clear before send keys
driver.findElement(By.cssSelector("#tinymce")).clear();
driver.findElement(By.cssSelector("#tinymce")).sendKeys("switching  with index");
        Thread.sleep(2000);
// 3. using WebElement to switching frame :

        driver.switchTo().parentFrame();
WebElement iframeWebElement=driver.findElement(By.tagName("iframe"));
driver.switchTo().frame(iframeWebElement);
        driver.findElement(By.cssSelector("#tinymce")).clear();

Thread.sleep(2000);

        driver.findElement(By.cssSelector("#tinymce")).sendKeys("switching  with WebElement");

    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/nested_frames");

        //switching to frame top
        driver.switchTo().frame("frame-top");
        //top has 3 frame under left middle and right
        //switch to frame middle
        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText());

        //goes back to top frame
        driver.switchTo().parentFrame();

        //switching right with index
        driver.switchTo().frame(2);

        System.out.println(driver.findElement(By.tagName("body")).getText());

        //go to main html to switch bottom
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        System.out.println(driver.findElement(By.tagName("body")).getText());


    }

}




