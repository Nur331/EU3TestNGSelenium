package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {

    public static void main(String[] args) {

  /*Verify Confirmation Message
  * open browser
  * go to http://practice.cybertekschool.com/forgot_password to an external site.
  * enter any email
  * verify that email is displayed in the input box
  * click on retrieve password button
  * verify that confirmation message says, 'your e-mail's been sent!'
  * */

// open browser
  WebDriver driver=WebDriverFactory.getDriver("Chrome");

//go to link
   driver.get("http://practice.cybertekschool.com/forgot_password");

//enter any email
        String expectedEmail="nuriman@gmail.com";

  WebElement emailInputBox= driver.findElement(By.name("email"));
  emailInputBox.sendKeys(expectedEmail);

// verify that email display in the input box

// somehow we should get text from web elements
// two main ways to get txt from webElement
// 1. getText()-->it work 99% and it will return String
// 2. getAttribute("value")--> second way of getting text especially input boxes


        String actualEmail = emailInputBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);

      if(expectedEmail.equals(actualEmail)){
          System.out.println("\"Pass\" = " + "Pass");
      }  else{
          System.out.println("\"Fail\" = " + "Fail");
      }

      // click on Retrieve button
        WebElement RetrieveButton=driver.findElement(By.id("form_submit"));
      RetrieveButton.click();

// verify confirmation message says, 'your e-mail's been sent!'
  WebElement actualConfirmationMessage=driver.findElement(By.name("confirmation_message")) ;

  String  actualMessage=actualConfirmationMessage.getText();
  String  expectedMessage="Your e-mail's been sent!";

   if(actualMessage.equals(expectedMessage)){
       System.out.println("\"Pass\" = " + "Pass");

   } else {
       System.out.println("\"Fail\" = " + "Fail");
       System.out.println("actualMessage = " + actualMessage);
       System.out.println("expectedMessage = " + expectedMessage);
   }

        driver.quit();
    }
}
