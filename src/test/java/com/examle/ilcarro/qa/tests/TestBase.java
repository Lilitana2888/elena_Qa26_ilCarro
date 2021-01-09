package com.examle.ilcarro.qa.tests;

import com.examle.ilcarro.qa.application.ApplicationManager;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.remote.BrowserType;


public class TestBase {

 //   protected static ApplicationManager app = new ApplicationManager();
    protected static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUp(){
        app.start();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

}
