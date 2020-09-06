package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver  driver= new ChromeDriver();

        driver.get("https://www.google.com");  // first page


        driver.navigate().to("http://www.facebook.com");  // second page

// get back to previous page/ refresh/ forward
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();


        driver.quit();







    }
}
