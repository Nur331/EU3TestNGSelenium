package com.cybertek.tests.day10_PopUps_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

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
driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
//click the Destroy the World button
driver.findElement(By.xpath("//button[.='Destroy the World']")).click();

//Click NO button
driver.findElement(By.xpath("//button[.='No']")).click();


    }
@Test
public void test2() throws InterruptedException {
driver.get("http://practice.cybertekschool.com/javascript_alerts");

driver.findElement(By.xpath("//button[1]")).click();

//switch to JS alert pop up
Alert alert=driver.switchTo().alert();

Thread.sleep(2000);

alert.accept();



// click for JS confirm
driver.findElement(By.xpath("//button[2]")).click();
Thread.sleep(2000);
alert.dismiss();


// click for JS Prompt
driver.findElement(By.xpath("//button[3]")).click();
Thread.sleep(2000);
// send keys to JS Prompt
alert.sendKeys("MikeSmith");
// if we wat to get text from pop-up, use gettext()
//alert.getText();
//click ok
alert.accept();

    }













}
