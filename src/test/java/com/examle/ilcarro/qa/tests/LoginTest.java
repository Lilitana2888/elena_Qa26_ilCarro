package com.examle.ilcarro.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        /*if user logged in, logout*/
        if (app.getUserHelper().isUserLoggedIn()) {
            app.getUserHelper().clickLogoutButtonOnHeader();
        }
    }

    @Test
    public void testLogin() throws InterruptedException {
        app.getUserHelper().clickLogInButton();
        app.getUserHelper().fillLoginForm("my.email1608881337043@gmail.com", "Aa1234567");
        app.getUserHelper().pause(2000);
        app.getUserHelper().clickYallaButton();

        Assert.assertTrue(app.getUserHelper().isUserLoggedIn());


    }


}
