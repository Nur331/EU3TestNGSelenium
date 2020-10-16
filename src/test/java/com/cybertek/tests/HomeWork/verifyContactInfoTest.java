package com.cybertek.tests.HomeWork;

import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyContactInfoTest extends TestBase {


/*
* Open the Chrome
* go to qa1.vytrack.com
* Login as sales manager
* navigate to customers -> contacts
* click on email mbrackstone9@example.com
* verify that full name is Mariam Brackstone
* Verify that email is mbrackstone9@example.com
* verify that phone number is +18982323434
* */


    @Test
   public void contactDetailsTest() {

        extentLogger = report.createTest("Contact Info Verification");

        LoginPage loginPage = new LoginPage();

        // loginPage.loginAsSalesManager();
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        extentLogger.info("username:" + username);
        extentLogger.info("password:" + password);
        extentLogger.info("login as a sales manager");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        BrowserUtils.waitFor(3);
        extentLogger.info("Navigate to -> Customers-> Contacts");
        dashboardPage.navigateToModule("Customers", "Contacts");

        ContactsPage ContactsPage = new ContactsPage();
        extentLogger.info("click on mbrackstone9@example.com ");
        ContactsPage.waitUntilLoaderScreenDisappear();
        ContactsPage.getContactEmail("mbrackstone9@example.com").click();

        ContactsPage.waitUntilLoaderScreenDisappear();
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String expectedFullname = "Mariam Brackstone";
        String actualFullName = contactInfoPage.fullName.getText();

        ContactsPage.waitUntilLoaderScreenDisappear();
        extentLogger.info("verify full name is " + expectedFullname);
        Assert.assertEquals(actualFullName, expectedFullname, "verify fullName");

        extentLogger.info("verify email is mbrackstone9@example.com" );
        Assert.assertEquals(contactInfoPage.email.getText(), "mbrackstone9@example.com", "verify email");

        extentLogger.info("verify phone number is +18982323434");
        Assert.assertEquals(contactInfoPage.phone.getText(), "+18982323434", "verify phone number");


        extentLogger.pass("PASSED");

    }

}
