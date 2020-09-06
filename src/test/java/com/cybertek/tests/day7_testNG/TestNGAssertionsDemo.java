package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void tes1() {

        System.out.println("Open browser");
        System.out.println("First test case");

      //  Assert.assertEquals("title", "Title");
        System.out.println("First Assertion");

        Assert.assertEquals("url", "url");
        System.out.println("Second Assertion");


    }

    @Test
    public void test2(){
        System.out.println("Second test case");
    }

@Test
public void test3(){
        String expectedTitle="Cyb";
        String actualTitle="Cybertek";

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"verify title starts with Cyb");

    }
@Test
public void test4(){
        // verify email contains @ sign
    String email="mike@smith.com";

    Assert.assertTrue(email.contains("@"),"verify email contains @");

}

@Test
public void test5(){
        Assert.assertFalse(0>1, "verify that 0 is not greater than 1");
}

@Test
public void test6(){
        Assert.assertNotEquals("one", "one");
}










@AfterMethod
    public void tearDown(){
        System.out.println("close browser");
    }














}
