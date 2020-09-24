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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActionsTest {

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
    public void hoverOverTest() throws InterruptedException {

driver.get("http://practice.cybertekschool.com/hovers");

WebElement img1=driver.findElement(By.tagName("img"));

// Actions --> class that contains all te user interactions
// how to create actions object --> passing driver as a constructor to connecting object and driver
Actions actions = new Actions(driver);
//perform()--> perform the action, complete the action
// moveToElement--> move your mouse to WebElement(hover over)
        Thread.sleep(2000);

actions.moveToElement(img1).perform();

WebElement viewLink= driver.findElement(By.linkText("View profile"));

Assert.assertTrue(viewLink.isDisplayed(), "verify view link is displayed");




    }

    @Test
    public void dragAndDrop() throws InterruptedException {
driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
driver.manage().window().maximize();

Actions actions= new Actions(driver);

// website shows two different cookies t accept, that's why we create list of webElement to catch one of them
List<WebElement> acceptAndClose=driver.findElements(By.xpath("//*[.='Accept and Close']"));
List<WebElement> acceptCookies=driver.findElements(By.xpath("//*[.='Accept Cookies']"));
Thread.sleep(2000);
if(acceptAndClose.size()>0){
    acceptAndClose.get(0).click();
}else if(acceptCookies.size()>0){
    acceptCookies.get(0).click();
}

WebElement source=driver.findElement(By.id("draggable"));
WebElement target=driver.findElement(By.id("droptarget"));

//  driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//Thread.sleep(2000);
// DO NOT forget to perform the actions

        // first way to DragAndDrop
//actions.dragAndDrop(source,target).perform();

//-------------------------------------------
        // second way to dragAndDrop
actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().perform();


    }














}
