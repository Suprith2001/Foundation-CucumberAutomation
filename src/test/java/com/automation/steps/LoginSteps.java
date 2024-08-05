package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage=new LoginPage();
    @Given("user is on website")
    public void user_is_on_website() {
       loginPage.openWebsite();
    }

    @When("user enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
       loginPage.enterUserNameAndPassword(username,password);
    }

    @When("click on login button")
    public void click_on_login_button() {
       loginPage.clickLoginButton();
    }

 
}
