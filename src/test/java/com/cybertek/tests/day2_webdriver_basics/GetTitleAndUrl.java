package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {


        // task open chrome and navigate to http://practice.cybertekschool.com
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        // getting title with selenium
        System.out.println(driver.getTitle());


        // getCurrentUrl --> get the url from browser
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // getPageSource()  --> gets the source of the page
        String pagesource = driver.getPageSource();
        System.out.println("pagesource = " + pagesource);


        driver.quit();

    }
}
