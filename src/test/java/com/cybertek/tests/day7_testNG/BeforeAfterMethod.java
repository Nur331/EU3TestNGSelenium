package com.cybertek.tests.day7_testNG;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    // runs only once before everything in the class
    @BeforeClass
    public void setupClass(){
        System.out.println("---Before Class---");
        System.out.println("executed one time before the class ");
    }



    @Test
    public void test1(){

        System.out.println("First test case");
    }


    @Test
    public void test2(){
        System.out.println("Second test case");
    }

     @Ignore         //ignore to run @Test annotation methods
    @Test
    public void Test3(){
    System.out.println("Third test case");

}


// Before and After method runs each time before each @Test annotation method.

    @BeforeMethod
    public void setUp(){
        System.out.println("WebDriver, Opening Browser");

    }
    // even if test fail , after method will run once

    @AfterMethod
    public void tearDown(){
    System.out.println("Closing Browser, quit");

}

    // runs only once after  everything in the class
    @AfterClass
    public void teardownClass(){
        System.out.println("---After Calss---");

        System.out.println("some reporting code here:");
    }












}
