package com.cybertek.tests.day16_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

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

@Test
    public void test1(){
    LoginPage loginPage= new LoginPage();
    loginPage.loginAsDriver();

    DashboardPage dashboardPage= new DashboardPage();

    dashboardPage.navigateToModule("Activities", "Calendar Events");

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

calendarEventsPage.waitUntilLoaderScreenDisappear();

BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent, 5);

calendarEventsPage.createCalendarEvent.click();

CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();

createCalendarEventsPage.repeat.click();

Assert.assertTrue(createCalendarEventsPage.days.isSelected(), "Verify repeat days is selected");

Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(),"verify weekday is not selected");


}















}
