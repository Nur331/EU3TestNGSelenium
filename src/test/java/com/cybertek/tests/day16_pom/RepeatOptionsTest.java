package com.cybertek.tests.day16_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatOptionsTest extends TestBase {


    /*Verify Radio Button
    * Open Browser
    * Login as Driver
    * Go to Activities -> Calendar Events
    * Click on create Calender Events
    * Click on repeat
    * Verify that repeat very days is checked
    * Verify that repeat weekday is not checked
    * */

    LoginPage loginPage= new LoginPage();


    @Test
    public void test1(){

loginPage.loginAsDriver();

    DashboardPage dashboardPage= new DashboardPage();

    dashboardPage.navigateToModule("Activities", "Calendar Events");

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

calendarEventsPage.waitUntilLoaderScreenDisappear();

BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent, 5);

calendarEventsPage.createCalendarEvent.click();

CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();
BrowserUtils.waitFor(5);
createCalendarEventsPage.repeat.click();

Assert.assertTrue(createCalendarEventsPage.days.isSelected(), "Verify repeat days is selected");

Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(),"verify weekday is not selected");


}
/*
* Open chrome Browser
* login as driver
* go to Activities -> Calendar Events
* Click on create calendar events button
* click on repeat checkbox
* verify that repeat options are Daily, weekly, Monthly Yearly(in this order)*/

@Test
    public void test2(){

     loginPage.loginAsDriver();

     DashboardPage dashboardPage= new DashboardPage();
     // go to Activities -> Calendar Events
    dashboardPage.navigateToModule("Activities", "Calendar Events");

    CalendarEventsPage calendarEventsPage= new CalendarEventsPage();
    // click on create calendar events
    // wait for loader mask

    calendarEventsPage.waitUntilLoaderScreenDisappear();

    BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent, 5);

    calendarEventsPage.createCalendarEvent.click();

    CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();

    createCalendarEventsPage.repeat.click();

    Select repeatsDropdown = createCalendarEventsPage.repeatOptionsList();

//verify that repeat options are Daily, weekly, Monthly Yearly(in this order)



List<String>  expectedList = Arrays.asList("Daily","Weekly","Monthly","Yearly");
// creating new empty list to convert list of webElement to List of String.
List<String>  actualList=new ArrayList<>();

List<WebElement> actualOptions= repeatsDropdown.getOptions();

    for (WebElement option : actualOptions) {
        // get text of each element and add to actual List
        actualList.add(option.getText());
    }


// ready method for getting text of list of web elements
 List<String> actualList2 = BrowserUtils.getElementsText(actualOptions);

Assert.assertEquals(actualList, expectedList,"verify option list has Daily, Weekly, Monthly,yearly");











}












}
