package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyURLnotChange {

    public static void main(String[] args) {

        /*Verify URL not change
        *   -open chrome browser
        *   - go to http://practice.cybertekschool.com/forgot_password   links to an ext
        *   - click on Retirve password
        *   - verify that url did not change
        *  */


        WebDriver driver= WebDriverFactory.getDriver("chrome");


        String expectURL="http://practice.cybertekschool.com/forgot_password";
        driver.get("http://practice.cybertekschool.com/forgot_password");

      // click on Retrieve password
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

        String actualURL=driver.getCurrentUrl();

        if (expectURL.equals(actualURL)){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
        }



        driver.quit();



    }
}
