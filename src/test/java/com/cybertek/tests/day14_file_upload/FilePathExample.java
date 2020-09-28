package com.cybertek.tests.day14_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FilePathExample {
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
    public void test() {

    }


   @Test
    public void test1() {
//full path:   resources->textfile.txt->right click->copy->absolute path
 //   /Users/yasenalinur/IdeaProjects/EU3TestNGSelenium/src/test/resources/textfile.txt

 // project path:    System.getProperty("user.dir");
//   /Users/yasenalinur/IdeaProjects/EU3TestNGSelenium

       String projectPath=System.getProperty("user.dir");
       System.out.println("projectPath = " + projectPath);

//  half after: resources->file.txt->right click->copy->copy path->path from content root
       String filePath="src/test/resources/textfile.txt";
       System.out.println("filePath = " + filePath);

       String fullPath=projectPath+"/"+filePath;
       System.out.println(fullPath);


    }









}


