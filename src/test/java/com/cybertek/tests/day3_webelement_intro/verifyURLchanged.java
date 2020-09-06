package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {
    public static void main(String[] args) {

    /*Task
    * open chrome browser
    * go to http://practice.cybertekschool.com/forgot_password  links to external site.
    * enter any email
    * click on retrieve password
    * verify that url changed to http://practice.cybertekschool.com/email_sent
    *  */

    // open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");

    // goto   http://practice.cybertekschool.com/forgot_password
    driver.get("http://practice.cybertekschool.com/forgot_password");

    //enter ay email
        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys("alinur.yasen@gmail.com");

        // click on button
       driver.findElement(By.id("form_submit")).click();

// verify that URL changed
        String actualURL=driver.getCurrentUrl();
        String expectURL="http://practice.cybertekschool.com/email_sent";

        if(actualURL.equals(actualURL)){
            System.out.println("Pass");
        }else {
            System.out.println("False");
            System.out.println("expectURL = " + expectURL);
            System.out.println("actualURL = " + actualURL);
        }

        // close browser
       driver.quit();


    }
}
