package com.cybertek.tests.day14_file_upload;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");
        //locating choose file button
        WebElement chooseFile = driver.findElement(By.name("file"));
        //sending file with sendKeys method

        // how to get file from desktop:
        //1.right click on the file
        //2.Hold option key
        //3.select option copy" file.txt" as pathname


        // get DYNAMIC path:
        String projectPath=System.getProperty("user.dir");
        String filePath="src/test/resources/textfile.txt";
        String fullPath=projectPath+"/"+filePath;

        chooseFile.sendKeys(fullPath);

        //  chooseFile.sendKeys("/Users/yasenalinur/Desktop/file.txt");
        //clicking upload button
        driver.findElement(By.id("file-submit")).click();

        //getting the file name from browser
        String actualFileName= driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is file.txt
        Assert.assertEquals(actualFileName,"textfile.txt");



    }


    // how to get your own property on your mac
    @Test
    public void test2(){
        System.out.println(System.getProperty("os.name"));

        System.out.println(System.getProperty("user.dir"));
    }



}
