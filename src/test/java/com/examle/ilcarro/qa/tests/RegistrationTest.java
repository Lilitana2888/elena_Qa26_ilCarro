package com.examle.ilcarro.qa.tests;


import com.examle.ilcarro.qa.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{
       @Test
    public void testRegistration() throws InterruptedException {
        app.getUserHelper().openRegForm();
        String email =  "my.email" + System.currentTimeMillis() + "@gmail.com";
        app.getUserHelper().fillRegistrationForm(new User()
                .withfName("Elena")
                .withlName("Ro")
                .withEmail(email)
                .withPassword("Aa1234567"));
        app.getUserHelper().selectCheckBox();
        app.getUserHelper().pause(2000);
        app.getUserHelper().clickYallaButton();
        app.getUserHelper().pause(3000);

        Assert.assertFalse(app.getUserHelper().isRegistrationFormPresent());
    }

    @Test
    public void testRegistration2() throws InterruptedException {
        app.getUserHelper().openRegForm();
        String email =  "myEmail" + System.currentTimeMillis() + "@yahoo.com";
        app.getUserHelper().fillRegistrationForm(new User()
                .withfName("Elena")
                .withlName("Ro")
                .withEmail(email));
        app.getUserHelper().selectCheckBox();
        app.getUserHelper().pause(2000);
        app.getUserHelper().clickYallaButton();
        app.getUserHelper().pause(3000);

        Assert.assertFalse(app.getUserHelper().isRegistrationFormPresent());
    }

//    @Test
//    public void testRegistrationNegative() throws InterruptedException {
//        app.getUserHelper().openRegForm();
//        String email =  "my.email" + System.currentTimeMillis();
//        app.getUserHelper().fillRegistrationForm(new User("Elena", "Ro", email, "Aa1234567"));
//        app.getUserHelper().selectCheckBox();
//        app.getUserHelper().pause(2000);
//        app.getUserHelper().clickYallaButton();
//        app.getUserHelper().pause(3000);
//
//        Assert.assertTrue(app.getUserHelper().isRegistrationFormPresent());
//
//    }

}


