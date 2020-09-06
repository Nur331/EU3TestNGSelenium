package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");


          Thread.sleep(3000);

          driver.get("http://practice.cybertekschool.com/new_tab");

          Thread.sleep(5000);

         driver.close();




// difference  between close and quit  :














    }
}
