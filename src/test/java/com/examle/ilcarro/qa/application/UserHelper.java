package com.examle.ilcarro.qa.application;

import com.examle.ilcarro.qa.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends  HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void logIn() throws InterruptedException {
        clickByCss("[href='/login']");
        // click(By.cssSelector("[href='/login']"));
        fillLoginForm("my.email1608881337043@gmail.com", "Aa1234567");
        pause(2000);
        clickByCss("[type=submit]");
    }


    public boolean isRegistrationFormPresent() {
        return isElementPresent(By.xpath("//h2[contains(., 'Registration')]"));
    }

    public void clickLogInButton() {
        clickByCss("[href='/login']");
    }



    public void selectCheckBox() {
        click(By.cssSelector("#check_policy"));
    }

    public void fillRegistrationForm(User user) {
        type(By.id("first_name"), user.getfName());
        type(By.cssSelector("#second_name"), user.getlName());

        System.out.println("email is: " + user.getEmail());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());
    }

    public void openRegForm() {
        click(By.cssSelector("[href='/signup']"));
    }



    public void fillLoginForm(String email, String password) {
        typeByCss("[name=email]", email);
        typeByCss("[name=password]", password);
    }



    public void clickLogoutButtonOnHeader() {
        click(By.xpath("//a[contains(., 'logOut')]"));
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }

}
