package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");


        //proper way


//        WebElement fullnameInput=driver.findElement(By.name("full_name"));
//        fullnameInput.sendKeys("Mike Smith");
//
//        WebElement emailButton=driver.findElement(By.name("email"));
//        emailButton.sendKeys("nur2@gmail.com");
//
//        Thread.sleep(3000);
//     WebElement signUpButton= driver.findElement(By.name("wooden_spoon"));
//     signUpButton.click();
//
//        Thread.sleep(3000);


          // lazy way
driver.findElement(By.name("full_name")).sendKeys("Mike Smith");
driver.findElement(By.name("email")).sendKeys("nur2@gmail.com");
driver.findElement(By.name("wooden_spoon")).click();

Thread.sleep(3000);

driver.quit();


    }
}
